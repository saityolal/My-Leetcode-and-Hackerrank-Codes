
public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 0 };
        System.out.println(firstMissingPositive(nums));
    }

    private static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        if (n == 0)
            return 1;

        int firstPositiveIndex = 0;
        while (firstPositiveIndex <  n && nums[firstPositiveIndex] <= 0) {
            firstPositiveIndex++;
        }

        if (firstPositiveIndex == n)
            return 1;

        if (nums[firstPositiveIndex] != 1)
            return 1;

        for (int i = firstPositiveIndex; i < n - 1; i++) {
            if (nums[i + 1] > nums[i] + 1) {
                return nums[i] + 1;
            }
        }

        return nums[n - 1] + 1;
    }
}
