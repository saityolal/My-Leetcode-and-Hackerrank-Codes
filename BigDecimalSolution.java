import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class BigDecimalSolution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int loop = scan.nextInt();
        scan.nextLine();//consume
        String[] numbers = new String[loop];
        
        for(int i=0;i<loop;i++){
            numbers[i] = scan.nextLine();
        }
        
        Arrays.sort(numbers, new Comparator<String>() {
            
            public int compare(String a, String b){

                BigDecimal bigDecimalA = new BigDecimal(a);
                BigDecimal bigDecimalB = new BigDecimal(b);

                return bigDecimalB.compareTo(bigDecimalA);
                
            }
        });

        for(String number : numbers){

            System.out.println(number);
        }

}
}
