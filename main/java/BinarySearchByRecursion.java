import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class BinarySearchByRecursion {
    public static void main(String[] args) {
        int[] nums = new int[]{5, -2, 124, 87, 9, 34, 2, 1, 65, 34, 2345, 456, -23, 432, -34, 22};
        Arrays.sort(nums);
        int high = nums.length - 1;
        int low = 0;
        //System.out.println(Arrays.toString(nums));
        System.out.println(recursionBinarySearch(nums, 65, low, high));
    }

    public static int recursionBinarySearch(int[] sortedArr, int key, int low, int high) {
        int mid = (low + high) / 2;

        if (high < low) return -1;

        if (key < sortedArr[mid]) return recursionBinarySearch(sortedArr, key, low, mid - 1);
        if (key > sortedArr[mid]) return recursionBinarySearch(sortedArr, key, mid + 1, high);
        if (key == sortedArr[mid]) return mid;
        return -1;
    }
}
