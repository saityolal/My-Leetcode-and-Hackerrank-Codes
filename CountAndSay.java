public class CountAndSay {

    public static void main(String[] args) {
        int n = 4;
        System.out.println(countAndSay(n));
    }

    private static String countAndSay(int n) {

        if (n == 1) {
            return "1";
        }
        String current = "1";
        for (int i = 2; i <= n; i++) {
            current = rle(current);
        }
        return current;

    }

    private static String rle(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                i++;
                count++;
            }
            result += String.valueOf(count) + s.charAt(i);
        }
        return result;
    }
}
