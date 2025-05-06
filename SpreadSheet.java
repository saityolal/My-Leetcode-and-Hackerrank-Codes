import java.util.HashMap;
import java.util.Map;

public class SpreadSheet {

    public static void main(String[] args) {
        SpreadSheet spreadSheet = new SpreadSheet();
        spreadSheet.setFormula("A1", "3");
        spreadSheet.setFormula("B1", "A1 - 2");
        System.out.println(spreadSheet.evaluate("B1"));
    }

    public static Map<String, String> formulas = new HashMap<>();

    public void setFormula(String cell, String expr) {
        formulas.put(cell, expr); 
    }

    public String evaluate(String expr) {
        String[] parts = expr.trim().split(" "); 
        int resultInt = 0;
        String operator = "+"; 
        for (String part : parts) {
            if (part.equals("+") || part.equals("-")) {
                operator = part; 
            } else {
                int value;

                if (formulas.containsKey(part)) {
                    value = Integer.parseInt(evaluate(formulas.get(part))); 
                } else {
                    value = Integer.parseInt(part); 
                }

                
                if (operator.equals("+")) {
                    resultInt += value;
                } else if (operator.equals("-")) {
                    resultInt -= value;
                }
            }
        }

        return String.valueOf(resultInt);
    }
}
