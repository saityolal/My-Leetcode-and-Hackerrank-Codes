import java.util.Arrays;

public class FindFirstandLastPositionofElementinSortedArray {

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int index = binarySearch(nums, target);
        if (index == -1) {
            return new int[] { -1, -1 };
        }

        int leftIndex = index;
        int rightIndex = index;
        while (leftIndex - 1 >= 0 && nums[leftIndex - 1] == target) {
            leftIndex--;
        }

        while (rightIndex + 1 < nums.length && nums[rightIndex + 1] == target) {
            rightIndex++;
        }

        return new int[] { leftIndex, rightIndex };

    }

    public static int binarySearch(int nums[], int target) {
        int min = 0;
        int max = nums.length - 1;

        while (min <= max) {
            int mid = (min + max) / 2;

            if (nums[mid] < target) {
                min = mid + 1;
            } else if (nums[mid] > target) {
                max = mid - 1;
            } else {
                return mid;
            }

        }
        return -1;
    }

}
