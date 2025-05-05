import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class LetterCombinationsOfPhoneNumber {

    public List<String> letterCombinations(String digits) {

        HashMap<String, String> map = new HashMap<>();

        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");

        List<String> result = new ArrayList<>();
        result.add("");

        if (digits.length() == 0) {
            return new ArrayList<String>();
        }

        for (int i = 0; i < digits.length(); i++) {
            String s = map.get(String.valueOf(digits.charAt(i)));
            List<String> newResult = new ArrayList<String>();

            for (String combination : result) {

                for (char ch : s.toCharArray()) {
                    newResult.add(combination + ch);

                }
            }
            result = newResult;
        }

        return result;
    }

}
