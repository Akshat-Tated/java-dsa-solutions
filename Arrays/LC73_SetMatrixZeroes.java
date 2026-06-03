package Arrays;

public class LC73_SetMatrixZeroes {
    public static void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        // int[] row = new int[r];
        // int[] col = new int[c];

        int col0 = 1; // this is the 0th column
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    if(j!=0){
                        matrix[0][j] = 0;
                    }else{
                        col0 = 0;
                    }
                }
            }
        }

        // convert 0s except row 1 and col 1
        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(matrix[i][j] != 0){
                    if (matrix[0][j] == 0 || matrix[i][0] == 0){
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        //iterate first col then first row
        if(matrix[0][0]==0){
            for(int i=0;i<c;i++){
                matrix[0][i] = 0;
            }
        }
        if(col0 == 0){
            for(int i=0;i<r;i++){
                matrix[i][0]=0;
            }
        }
    }
    public static void main(String[] args) {
        // Example matrix
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        
        setZeroes(matrix);
        
        // Print result
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
