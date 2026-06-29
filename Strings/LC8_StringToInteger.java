package Strings;

public class LC8_StringToInteger {
    public static int myAtoi(String s) {
        //edge case 
        if(s == null || s.length() == 0) return 0;

        //skip leading whitespaces 
        int i=0, n= s.length();
        while(i<n && s.charAt(i)==' '){
            i++;
        }

        //check for sign
        int sign = 1;
        if (i < n) {
            if (s.charAt(i) == '-') {
            sign = -1;
            i++;
            } else if (s.charAt(i) == '+') {
            i++;
            }
        }

        //convert digit to number
        int result = 0;
        while(i<n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';

            //manage overflow
            if(result> (Integer.MAX_VALUE - digit) /10){
                return sign==1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result *10 + digit;
            i++;
        }
        return result*sign;
    }
    public static void main(String[] args) {
        String s = "42";
        System.out.println(myAtoi(s));
    }
}
