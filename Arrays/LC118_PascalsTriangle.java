package Arrays;

import java.util.ArrayList;
import java.util.List;

public class LC118_PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=1;i<=numRows;i++){
            List<Integer> li = new ArrayList<>();
            for(int j=1;j<=i;j++){
                if(j==1 || j==i){
                    li.add(1);
                // }else if(j==2 || j==i-1){
                //     li.add(i-1);
                }else{
                    int sum = ans.get(i-2).get(j-2) + ans.get(i-2).get(j-1);
                    li.add(sum);
                }
            }
            ans.add(li);
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;

        List<List<Integer>> result = generate(n);
        for (List<Integer> row : result) {
            for (Integer val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}
