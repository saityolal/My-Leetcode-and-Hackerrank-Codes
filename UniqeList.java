
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

public class UniqeList {

    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int m = scan.nextInt();
            scan.nextLine();

            int[] numbers = new int[n];

            for (int i = 0; i < n; i++) {
                numbers[i] = scan.nextInt();
            }
            Deque<Integer> deque = new ArrayDeque<>();
            HashSet<Integer> distinctList = new HashSet<>();
            int maxUnique = 0;
            for (int i = 0; i < n; i++) {
                deque.add(numbers[i]);
                distinctList.add(numbers[i]);

                if (deque.size() == m) {
                    maxUnique = Math.max(maxUnique, distinctList.size());

                    int removed = deque.removeFirst();

                    if (!deque.contains(removed)) {
                        distinctList.remove(removed);

                    }

                }

            }
            System.out.println(maxUnique);
            scan.close();
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
