package Strings;

public class LC459_RepeatedSubstringPatterns {
    public static boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int len = 1; len <= n / 2; len++) {
            if (n % len != 0) continue;
            String sub = s.substring(0, len);
            StringBuilder sb = new StringBuilder();
            int times = n / len;
            for (int i = 0; i < times; i++) {
                sb.append(sub);
            }
            if (sb.toString().equals(s)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "abab";
        System.out.println(repeatedSubstringPattern(s));
    }
}
