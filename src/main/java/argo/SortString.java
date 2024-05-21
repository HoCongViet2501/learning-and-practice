package argo;

public class SortString {
    public static void main(String[] args) {
        System.out.println(sortString("abckdjfkdabaabvv"));
    }

    public static String sortString(String s) {
        int[] freq = new int[26]; // Mảng tần số cho các ký tự từ 'a' đến 'z'
        StringBuilder result = new StringBuilder();

        // Đếm tần số xuất hiện của mỗi ký tự
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        // Xây dựng xâu kết quả
        while (result.length() < s.length()) {
            for (int i = 0; i < 26; i++) {
                if (freq[i] > 0) {
                    result.append((char) (i + 'a'));
                    freq[i]--;
                }
            }
            for (int i = 25; i >= 0; i--) {
                if (freq[i] > 0) {
                    result.append((char) (i + 'a'));
                    freq[i]--;
                }
            }
        }

        return result.toString();
    }

}
