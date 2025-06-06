import java.util.Stack;

public class LongestValidParenthesesDebug {
    public static void main(String[] args) {
        String s = ")()())";
        System.out.println("En uzun geçerli parantez uzunluğu: " + longestValidParentheses(s));
    }

    public static int longestValidParentheses(String s) {
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
                System.out.println("i=" + i + ", '(' bulundu, stack: " + stack);
            } else {
                stack.pop();
                System.out.println("i=" + i + ", ')' bulundu, stack pop sonrası: " + stack);

                if (stack.isEmpty()) {
                    stack.push(i);
                    System.out.println("Stack boş, yeni referans eklendi: " + stack);
                } else {
                    int currentLen = i - stack.peek();
                    result = Math.max(result, currentLen);
                    System.out.println("Geçerli uzunluk hesaplandı: " + currentLen + ", en uzun: " + result);
                }
            }
        }

        return result;
    }
}
