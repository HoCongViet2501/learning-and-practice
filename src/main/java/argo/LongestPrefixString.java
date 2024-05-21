package argo;

import java.util.Arrays;

public class LongestPrefixString {
    public static void main(String[] args) {
        String[] s = new String[]{"flower", "flow", "flight"};
        System.out.println("Longest prefix: " + findLongestPrefixString(s));
    }

    private static String findLongestPrefixString(String[] s) {
        Arrays.sort(s);
        String sFirst = s[0];
        String sLast = s[s.length - 1];
        int i = 0;
        while (i < sFirst.length() && i < sLast.length() && sFirst.charAt(i) == sLast.charAt(i)) {
            i++;
        }
        return sFirst.substring(0, i);
    }
}
