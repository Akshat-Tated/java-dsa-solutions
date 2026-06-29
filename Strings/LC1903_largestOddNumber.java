package Strings;

public class LC1903_largestOddNumber {
    public static String largestOddNumber(String num) {
        int i = num.length() - 1;
        while (i >= 0) {
            if ((num.charAt(i) - '0') % 2 == 1) {
                break;
            }
            i--;
        }
        return (i < 0) ? "" : num.substring(0, i + 1);
    }
    public static void main(String[] args) {
        String num = "52";
        System.out.println(largestOddNumber(num));
    }
}
