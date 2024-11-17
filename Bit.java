
import java.util.BitSet;
import java.util.Scanner;

public class Bit {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        scan.nextLine();// to consume rest of the line

        BitSet B1 = new BitSet(n);
        BitSet B2 = new BitSet(n);

        for (int i = 0; i < m; i++) {

            String condition = scan.next();
            int x = scan.nextInt();
            int y = scan.nextInt();

            switch (condition) {
                case "AND":
                    if (x == 1) B1.and(B2); 
                    else B2.and(B1);
                    break;

                case "OR":
                    if (x == 1) B1.or(B2); 
                    else B2.or(B1);
                    
                    break;
                case "XOR":
                    if (x == 1) B1.xor(B2); 
                    else 
                        B2.xor(B1);
                    
                    break;
                case "FLIP":
                    if (x == 1) B1.flip(y); 
                    else B2.flip(y);
                    
                    break;

                case "SET":
                    if (x == 1) B1.set(y); 
                    else B2.set(y);
                    break;
            }
            System.out.println(B1.cardinality() + " " + B2.cardinality());
        }
        
    }
}
