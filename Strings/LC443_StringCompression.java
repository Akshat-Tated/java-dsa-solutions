package Strings;

public class LC443_StringCompression {
    public static int compress(char[] chars) {
        StringBuilder s = new StringBuilder();
        int count = 1;
        for(int i =0;i<chars.length-1;i++){
            if(chars[i]!=chars[i+1]){
                if(count==1){
                    s.append(chars[i]);
                }else{
                    s.append(chars[i]);
                    s.append(count);
                }
                count = 1;
            }else{
                count++;
            }
        }
        s.append(chars[chars.length-1]);
        if(count != 1){
            s.append(count);
        }
        for(int i =0;i<s.length();i++){
            chars[i] = s.charAt(i);
        }
        return s.length();
    }
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(compress(chars));
    }
}
