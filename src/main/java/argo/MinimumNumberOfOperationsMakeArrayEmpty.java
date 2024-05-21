package argo;


import java.util.*;

public class MinimumNumberOfOperationsMakeArrayEmpty {
    public static void main(String[] args) {

    }

    private Integer makeArrayEmpty(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        return 0;
    }
}
