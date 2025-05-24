import java.util.*;

public class List {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int loop = scan.nextInt();
        List<Integer> liste = new ArrayList<>();
        while (loop-- > 0) {
            liste.add(scan.nextInt());

        }
        int index = 0;
        int op = scan.nextInt(); scan.nextLine();
        while (op-- > 0) {
            String op_name = scan.nextLine();
            switch (op_name) {
                case "Insert":
                    index = scan.nextInt();
                    int y = scan.nextInt();
                    liste.add(index, y);
                    break;

                case "Delete":
                    index = scan.nextInt();
                    liste.remove(index);
                    break;
            }
        }
        for (int x : liste) {
            System.out.println(x + " ");
        }
    }
}