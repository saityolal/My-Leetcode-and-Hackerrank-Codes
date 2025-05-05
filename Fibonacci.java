import java.util.Scanner;

public class Fibonacci {

    public static void main(String args[]) {

        try {
            System.err.println("Please enter a number to find the Fibonacci sequence:");
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            scan.close();
            findFibonacci(n);
            System.out.println("Fibonacci number at position " + n + " is: " + findFibonacci(n));
        } catch (Exception e) {
            System.err.println("An error occurred while reading input: " + e.getMessage());
        }

    }

    public static int findFibonacci(int n) {

        int fib[] = new int[n + 1];
        fib[0]=0;
        fib[1]=1;
        for(int i=2; i<=n; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[n];

    }

}
