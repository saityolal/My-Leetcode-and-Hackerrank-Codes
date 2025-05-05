
import java.util.Scanner;

public class ReverseWords {

    public static void main(String args[]) {
        System.err.println("Enter the string to be reversed");
        
        try {
            Scanner scan = new Scanner(System.in);
            String text = scan.nextLine();
            System.err.println("reversed version is: " + reverseWords(text));
            scan.close();
        } catch (Exception e) {
            System.err.println("An error occurred while reading input: " + e.getMessage());
        }          
        
        
    }

    private static String reverseWords(String text) {
        String[] words = text.trim().split(" ");
        StringBuilder reversed = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }
}
