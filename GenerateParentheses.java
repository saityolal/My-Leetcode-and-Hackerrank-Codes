
import java.util.ArrayList;
import java.util.List;

class GenerateParentheses {
    public static void main(String[] args) {
        GenerateParentheses gp = new GenerateParentheses();
        System.out.println(gp.generateParentheses(3));
    }

    public List<String> generateParentheses(int n) {
        List<String> result = new ArrayList<>();
        generateParentheses(result, "", n, n);

        return result;

    }

    private void generateParentheses(List<String> result, String current, int open, int close) {
        if (open == 0 && close == 0) {
            result.add(current);
            return;
        }
        if (open > close) {
            return;
        }
        if (open > 0) {
            generateParentheses(result, current + "(", open - 1, close); //o2 c3  // o1 c2
        }

        if (close > 0) {
            generateParentheses(result, current + ")", open, close - 1); //o2 c2 // o1 c1
        }

    }
}

