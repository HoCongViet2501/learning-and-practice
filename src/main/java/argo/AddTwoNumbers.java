package argo;

import java.util.*;

public class AddTwoNumbers {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 11, 15};
        Thread thread1 = new Thread();
        thread1.start();
        System.out.println("solution 1:" + Arrays.toString(addTwoNumbers(arr, 18)));

        Thread thread2 = new Thread();
        thread2.start();
        System.out.println("solution 2:" + Arrays.toString(addTwoNumbersHashMap(arr, 22)));

    }

    private static int[] addTwoNumbersHashMap(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{};
    }

    private static int[] addTwoNumbers(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
