
import java.io.*;
import java.util.*;
import java.util.stream.*;

public class OneDimentionalArray {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        while (n > 0) {
            List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .limit(n)
                    .collect(Collectors.toList());
            n--;
            
            a.forEach(System.out::println);

        }// System.out.println("First :" + a.get(0));
        bufferedReader.close();
    }
}
