public class SetmatixZeros {
        //This solution only suitable for input as positve.It does't work for negative number because we modify the 0 as -1, so If matrix input coming with -1 value, It gives wrong answer.
    /*public void setMatrixZeros(int[][]matrix,int row,int col){
        row_track=row;
        col_track=col;
        while(col_track<size && row_track<size){
            if(matrix[row][col_track]!=0)
                matrix[row][col_track--]=-1;
            if(matrix[row_track][col]!=0)
                matrix[row_track--][col]=-1;
        }
        matrix[row][col]=0;
    }
    public void setZeroes(int[][] matrix) {
        int row_size=matrix.length;
        int col_size=matrix[0].length;
        for(int row=0;row<row_size;row++){
            for(int col=0;col<col_size;col++){
                if(matrix[row][col]==0){
                    setMatrixZeros(matrix,row,col);
                }
            }
        }
        for(int row=0;row<size;row++){
            for(int col=0;col<size;col++){
                if(matrix[row][col]==-1){
                    matrix[row][col]=0;
                }
            }
        }
    }*/


        //Optimal Solution
        public void setZeroes(int[][] matrix){
            boolean flag=false;
            int rSize=matrix.length;
            int cSize=matrix[0].length;
            for(int row=0;row<rSize;row++){
                if(matrix[row][0]==0) flag=true;
                for(int col=1;col<cSize;col++){
                    if(matrix[row][col]==0){
                        matrix[row][0]=0;
                        matrix[0][col]=0;
                    }
                }
            }
            for(int row=rSize-1;row>=0;row--){
                for(int col=cSize-1;col>0;col--){
                    if(matrix[row][0]==0 || matrix[0][col]==0){
                        matrix[row][col]=0;
                    }
                }
                if(flag==true)
                    matrix[row][0]=0;
            }

        }
}
