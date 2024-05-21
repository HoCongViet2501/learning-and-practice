package argo;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String roman = "III";
        System.out.println(romanToInteger(roman));
    }

    private static int romanToInteger(String roman) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        int ans = 0;
        for (int i = 0; i < roman.length(); i++) {
            if (map.get(roman.charAt(i)) < map.get(roman.charAt(i + 1))) {
                ans += map.get(roman.charAt(i));
            }
        }
        return 0;
    }
}
