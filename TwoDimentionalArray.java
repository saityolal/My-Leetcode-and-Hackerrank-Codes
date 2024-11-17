
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TwoDimentionalArray {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );

                for (List<Integer> row : arr) {
                    if(row.get(i)<-9 || row.get(i)>9){
                        throw new RuntimeException();
                    }
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        int hourglass_sum = 0;
        for (int i = 0; i < arr.size(); i++) {;

            hourglass_sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                    + arr[i + 1][j + 1]
                    + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]

            bufferedReader.close();
        }
    }
