package Arrays;

import java.util.ArrayList;
import java.util.List;

public class LC54_SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> spiral = new ArrayList<>();
        int top =0, bottom = n-1, left = 0, right = m-1;
        while(top<=bottom && left<=right){
            //going left to right
            for(int i=left;i<=right;i++){
                spiral.add(matrix[top][i]);
            }
            top++;
            //going top to bottom
            for(int i = top;i<=bottom;i++){
                spiral.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {
                //going right to left
                for(int i=right;i>=left;i--){
                    spiral.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            if (left <= right) {
                //going bottom to top
                for(int i = bottom;i>=top;i--){
                    spiral.add(matrix[i][left]);
                }
                left++;
            }
        }
        return spiral; 
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(spiralOrder(matrix));
    }
}
