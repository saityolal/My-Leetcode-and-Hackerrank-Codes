
import java.util.*;

public class ArrayListSolution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        ArrayList<ArrayList<Integer>> arr1 = new ArrayList<>();
        // ArrayList<Integer> arr2 = new ArrayList<>();

        while (n > 0) {
            n--;
            int d = scan.nextInt();
            ArrayList<Integer> arr2 = new ArrayList<>();
            for (int i = 0; i < d; i++) {

                arr2.add(scan.nextInt());
            }
            arr1.add(arr2);
        }

        
        int q = scan.nextInt();
        while (q > 0) {
            try {
                q--;
                int i = scan.nextInt();
                int j = scan.nextInt();
                if (i > 0 && i <= arr1.size() && j > 0 && j <= arr1.get(i - 1).size()) {
                    System.out.println(arr1.get(i - 1).get(j - 1));
                } else {
                    System.out.println("ERROR!");
                }
                
            } catch (Exception e) {
                System.out.println("ERROR!");
            }

            
        }
        scan.close();
    }
}
