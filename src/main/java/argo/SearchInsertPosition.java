package argo;

import java.util.LinkedList;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5, 6};
        System.out.println(find(nums, 2));
    }

    private static int find(int[] nums, int target) {
        int start = 0, mid;
        int end = nums.length - 1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return 0;
    }
}
