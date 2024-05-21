package argo;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }


    private static boolean isPalindrome(int x) {
        int tmp = x;
        int reverse=0;
        while (tmp > 0){
            int lastDigit= tmp % 10;
            tmp /= 10;
            reverse = reverse * 10 +lastDigit;
        }
        return reverse == x;
    }

}
