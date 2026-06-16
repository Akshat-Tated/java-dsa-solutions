package Arrays;
import java.util.Arrays;

public class LC1310_XORQueriesOfSubarray {
    public static int[] xorQueries(int[] arr, int[][] queries) {
        int[] ans = new int[queries.length];
        for(int i=1;i<arr.length;i++){
            arr[i] = arr[i-1] ^ arr[i];
        } // prefix xor array
        for(int i=0;i<queries.length;i++){
            int left = queries[i][0];
            int right = queries[i][1];
            if(left != 0){
                ans[i] = arr[left-1] ^ arr[right];
            }else{
                ans[i] = arr[right];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,8};
        int[][] queries = {
            {0,1},
            {1,2},
            {0,3},
            {3,3}
        };
        System.out.println(Arrays.toString(xorQueries(arr, queries)));
    }
}
