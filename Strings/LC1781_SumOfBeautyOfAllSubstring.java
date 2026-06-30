package Strings;

import java.util.HashMap;
import java.util.Map;

public class LC1781_SumOfBeautyOfAllSubstring {
    public static int beautySum(String s) {
        int n = s.length();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            Map<Character, Integer> freq = new HashMap<>();

            for (int j = i; j < n; j++) {
                freq.put(s.charAt(j), freq.getOrDefault(s.charAt(j), 0) + 1);

                int maxim = Integer.MIN_VALUE;
                int minim = Integer.MAX_VALUE;
                for (int val : freq.values()) {
                    minim = Math.min(minim, val);
                    maxim = Math.max(maxim, val);
                }

                sum += (maxim - minim);
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        String s = "aabcb";
        System.out.println(beautySum(s));
    }
}
