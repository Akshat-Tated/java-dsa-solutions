package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC56_MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> ans = new ArrayList<>();

        int i = 0;

        while (i < intervals.length) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            int j = i + 1;

            while (j < intervals.length && intervals[j][0] <= end) {
                end = Math.max(end, intervals[j][1]);
                j++;
            }

            ans.add(new int[]{start, end});
            i = j;
        }

        return ans.toArray(new int[ans.size()][]);
    }
    public static void main(String[] args) {
        int[][] intervals = {
            {1,3},
            {2,6},
            {8,10},
            {15,18}
        };
        int[][] result = merge(intervals);

        for (int[] val : result) {
            System.out.println(Arrays.toString(val));
        }
    }
}
