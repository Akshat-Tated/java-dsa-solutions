package Arrays;

public class LC74_SearchA2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix[0].length; // no. of column
        int n = matrix.length; // no. of rows

        int low = 0;
        int high = m*n-1;
        // think of 2d array like one sorted array
        while(low<=high){
            int mid = low + (high-low)/2;
            int row =  mid/m;
            int col = mid%m;

            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col]>target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };
        int target = 3;
        System.out.println(searchMatrix(matrix, target));
        
    }
}
