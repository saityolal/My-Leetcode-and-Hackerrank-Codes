public class MultiplyStrings {
    public static void main(String[] args) {
        String num1 = "99";
        String num2 = "99";
        System.out.println(multiply(num1, num2));
    }
    private static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int m = num1.length();
        int n = num2.length();
        
        int[] result = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {
            int digit1 = num1.charAt(i) - '0';
            
            for (int j = n - 1; j >= 0; j--) {
                int digit2 = num2.charAt(j) - '0';
                
                int product = digit1 * digit2;
                int sum = product + result[i + j + 1];  
                
                result[i + j + 1] = sum % 10;  // Current digit
                result[i + j] += sum / 10;     // Carry over to the next position
            }
        }


        StringBuilder sb = new StringBuilder();
        for (int digit : result) {
            if (sb.length() == 0 && digit == 0) {
                continue;
            }
            sb.append(digit);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
