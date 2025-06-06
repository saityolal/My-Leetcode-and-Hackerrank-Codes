public class SearchinRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        if (nums.length <= 3) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    return i;
                }
            }
            return -1;
        }
        return findTarget(nums, target);
    }

    public static int findTarget(int[] nums, int target) {
        int min = 0;
        int max = nums.length - 1;

        while (min <= max) {
            int mid = (min + max) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[min] <= nums[mid]) {
                if (nums[min] <= target && target < nums[mid]) {
                    max = mid - 1;
                } else {
                    min = mid + 1;
                }
            } 
            else {
                if (nums[mid] < target && target <= nums[max]) {
                    min = mid + 1;
                } else {
                    max = mid - 1;
                }
            }
        }

        return -1;
    }
}
