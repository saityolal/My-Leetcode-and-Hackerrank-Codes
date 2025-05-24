import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PermutationGenerator {
    public static void main(String[] args) {
        try {
            // Çıktı karakter kodlamasını UTF-8 olarak ayarla
            System.setOut(new PrintStream(System.out, true, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        List<String> input = new ArrayList<>(Arrays.asList("foo", "bar", "the", "baz"));
        List<List<String>> permutations = new ArrayList<>();

        String s = "barfoothebazfoobarman"; 
        String[] words = { "foo", "bar", "the", "baz" };

        generatePermutations(input, 0, permutations);

        List<String> permut = new ArrayList<>();
        for (List<String> innerList : permutations) {
            StringBuilder sb = new StringBuilder();
            for (String str : innerList) {
                sb.append(str);
            }
            permut.add(sb.toString());
        }

        List<Integer> result = new ArrayList<>();
        for (String comb : permut) {
            System.out.println("Aranan kombinasyon: " + comb); 
            int index = s.indexOf(comb);
            while (index != -1) {
                result.add(index);
                System.out.println("Bulundu! İndeks: " + index); 
                index = s.indexOf(comb, index + 1);
            }
        }

        System.out.println("\nToplam eşleşme sayısı: " + result.size());
        System.out.println("Eşleşen indeksler: " + result);
    }

    public static void generatePermutations(List<String> list, int start, List<List<String>> result) {
        if (start == list.size() - 1) {
            result.add(new ArrayList<>(list)); 
            return;
        }

        for (int i = start; i < list.size(); i++) {
            Collections.swap(list, start, i); 
            generatePermutations(list, start + 1, result); 
            Collections.swap(list, start, i); 
        }
    }
}