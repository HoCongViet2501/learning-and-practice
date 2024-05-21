package argo;

public class ValidParenthesesString {
    public static void main(String[] args) {
        String s = "(1+(2*3)+(((8))/4))+1";
        System.out.println("MAx depth: " + findMaxDepthParentheses(s));
    }

    private static Integer findMaxDepthParentheses(String s) {
        int maxDepth = 0;
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
                if (count > maxDepth)
                    maxDepth = count;
            } else if (c == ')') {
                count--;
            }
        }
        return maxDepth;
    }

}
