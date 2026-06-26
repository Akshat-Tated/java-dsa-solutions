package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC438_FindAllAnagramsInString {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        if (s.length() < p.length()) {
            return ans;
        }
        int[] pCnt = new int[26];
        int[] sCnt = new int[26];

        for (char c : p.toCharArray()) {
            pCnt[c - 'a']++;
        }
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            sCnt[s.charAt(right) - 'a']++;

            if (right - left + 1 > p.length()) {
                sCnt[s.charAt(left) - 'a']--;
                left++;
            }

            if (Arrays.equals(pCnt, sCnt)) {
                ans.add(left);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s, p));

    }
}
