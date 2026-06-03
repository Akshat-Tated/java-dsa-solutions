package Arrays;

import java.util.Arrays;

public class LC48_RotateImage {
    public static void rotate(int[][] matrix) {
        //changing row to column
        for(int i = 0;i<matrix.length-1;i++){
            for(int j=i+1;j<matrix.length;j++){
                if(i!=j){
                    int temp =matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        // reverse every row
        for(int i = 0;i<matrix.length;i++){
            for(int j=0;j<matrix.length/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        rotate(matrix);
        for (int[] val : matrix) {
            System.out.println(Arrays.toString(val));
        }
    }
}
