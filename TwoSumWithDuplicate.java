
import java.util.HashMap;
import java.util.Map;

public class TwoSumWithDuplicate {

    public static void main(String args[]) {

        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 8;
        twoSum(nums, target);
    }

    public static boolean twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        boolean pairFound = false;
        for (int num : nums) {
            int complement = target - num;

            if (map.containsKey(complement)) {
                // if complement == num, make sure there's at least two occurrences
                if (complement == num) {
                    if (map.get(complement) > 1) {
                        System.out.println("Pair found: " + num + " + " + complement);
                        pairFound = true;

                    }
                } else if (num != complement) {
                    System.out.println("Pair found: " + num + " + " + complement);
                    pairFound = true;
                    // if complement != num, we can use the current number and the complement

                } else {
                    map.put(num, map.getOrDefault(num, 0) + 1);
                }
            }
            // add count of current number, if it exists update count of current number
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        if (!pairFound) {
            System.out.println("No pair found");
        }
        return pairFound;
    }
}
