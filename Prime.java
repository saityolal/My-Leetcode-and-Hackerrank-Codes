
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Prime {

    public static void main(String[] args) {
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(isr);

            String s = bufferedReader.readLine();
            //Integer.parseInt(s);
            BigInteger n = new BigInteger(s);
            if (n.isProbablePrime(10)) {
                System.err.println("Prime");
            } else {
                System.err.println("Not Prime");
            }
            bufferedReader.close();
        }catch(Exception e){
            System.err.println(e.toString());
        }
    }

}
