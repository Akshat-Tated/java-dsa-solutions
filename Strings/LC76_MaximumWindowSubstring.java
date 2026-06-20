package Strings;

import java.util.HashMap;

public class LC76_MaximumWindowSubstring {
    public static String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }

        HashMap<Character, Integer> freq = new HashMap<>();

        for (char ch : t.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        int required = t.length();

        int i = 0;
        int minLen = Integer.MAX_VALUE;
        int startIdx = 0;

        for (int j = 0; j < s.length(); j++) {

            if (freq.containsKey(s.charAt(j))) {
                if (freq.get(s.charAt(j)) > 0) {
                    required--;
                }
                freq.put(s.charAt(j), freq.get(s.charAt(j)) - 1);
            }

            while (required == 0) {
                if (j - i + 1 < minLen) {
                    minLen = j - i + 1;
                    startIdx = i;
                }
                // check if character at i is in t (hashmap) or not 
                if (freq.containsKey(s.charAt(i))) {
                    freq.put(s.charAt(i), freq.get(s.charAt(i)) + 1);
                    if (freq.get(s.charAt(i)) > 0) {
                        required++;
                    }
                }
                i++; // shrinking window
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(startIdx, startIdx + minLen);
    }
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t));
    }
}
