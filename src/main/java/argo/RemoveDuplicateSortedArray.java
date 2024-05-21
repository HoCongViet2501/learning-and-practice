package argo;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateSortedArray {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicate(arr));
    }

//    private static int removeDuplicate(int[] arr) {
//        Set<Integer> map = new HashSet<>();
//        for (int j : arr) {
//            map.add(j);
//        }
//        System.out.println(map);
//        return map.size();
//    }

    private static int removeDuplicate(int[] arr) {
        int j = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]){
                arr[j] = arr[i];
                j++;
            }
        }
        return j;
    }
}
