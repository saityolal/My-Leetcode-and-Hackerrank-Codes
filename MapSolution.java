import java.util.HashMap;
import java.util.Scanner;

public class MapSolution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int loop = scan.nextInt();
        scan.nextLine();
        int loop2 = loop;
        HashMap<String, Integer> infoMap = new HashMap<>();

        while (loop-- > 0) {
            String name = scan.nextLine();
            int phone = scan.nextInt();
            scan.nextLine();
            infoMap.put(name, phone);
        }

        // System.out.println(infoMap.get(name2));
        for (int i = 0; i < loop2; i++) {
            String name2 = scan.nextLine();
            if (infoMap.containsKey(name2)) {
                System.out.println(name2 + "=" + infoMap.get(name2));
            } else {
                System.out.println("Not found");
            }
        }

        scan.close();
    }
}