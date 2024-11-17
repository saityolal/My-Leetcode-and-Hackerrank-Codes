import java.math.BigInteger;
import java.util.*;

public class Big_Integer {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger bg = scan.nextBigInteger();
        BigInteger bg2 = scan.nextBigInteger();
        if(200<bg.toString().length() && 200<bg2.toString().length()) System.out.println("Error");
        
        System.out.println(bg.add(bg2));
        System.out.println(bg.multiply(bg2));
        
    }
}