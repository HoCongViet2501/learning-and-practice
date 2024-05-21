package argo;

public class IsomorphicString {
    public static void main(String[] args) {
        String s = "eggg", t = "addr";
        System.out.println("Is isomorphic string: " + checkIsomorphic(s, t));
    }

    private static boolean checkIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] mapS = new int[257]; // store index of characters in string s
        int[] mapT = new int[257]; // store index of characters in string t

        for (int i = 0; i < s.length(); i++) {
            // check if index of current char in string s
            // is different from index of corresponding char in string t

            if (mapS[s.charAt(i)] != mapT[t.charAt(i)]) {
                return false; // different -> not isomorphic
            }
            // update indices of characters in both strings
            mapS[s.charAt(i)] = i + 1;
            mapT[t.charAt(i)] = i + 1;

            int s2 = mapS[s.charAt(i)];
            int t2 = mapT[t.charAt(i)];

        }
        // loop complete without false -> string is isomorphic
        return true;
    }
}
