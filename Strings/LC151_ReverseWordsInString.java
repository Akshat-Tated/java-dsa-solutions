package Strings;

public class LC151_ReverseWordsInString {
    public static String reverseWords(String s) {
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        int j = s.length() - 1;
        while (j >= 0) {
            int end = j;
            while (j >= 0 && s.charAt(j) != ' ') {
                j--;
            }
            int start = j + 1;
            sb.append(s.substring(start, end + 1));
            while (j >= 0 && s.charAt(j) == ' ') {
                j--;
            }
            if (j >= 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
}
