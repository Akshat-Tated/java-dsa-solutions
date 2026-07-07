package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LC451_SortCharactersByFreq {
    public static String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        List<Character> chars = new ArrayList<>(map.keySet());

        chars.sort((a, b) -> map.get(b) - map.get(a));

        StringBuilder ans = new StringBuilder();

        for (char ch : chars) {
            int count = map.get(ch);
            while (count-- > 0) {
                ans.append(ch);
            }
        }

        return ans.toString();
    }
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }
}
