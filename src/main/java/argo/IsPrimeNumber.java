package argo;

public class IsPrimeNumber {
    public static void main(String[] args) {
        int n = 11;
        System.out.println(checkIsPrimeNumber(n));
    }

    private static boolean checkIsPrimeNumber(int n) {
        for (int j = 2; j <= n / 2; j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }
}
