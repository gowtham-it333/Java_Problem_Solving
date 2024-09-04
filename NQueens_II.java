public class NQueens_II {
        int solCtr=0;
        public boolean isSafe(int check_row,int check_col,int n,int[] queenPos){
            int row,col;
            for(row=check_row-1,col=check_col-1; row>=0&&col>=0; row--,col--)
                if(queenPos[row]==col) return false;

            for(row=check_row-1,col=check_col; row>=0;row--)
                if(queenPos[row]==col) return false;

            for(row=check_row-1,col=check_col+1; row>=0&&col<n;row--,col++)
                if(queenPos[row]==col) return false;

            return true;
        }

        public void queenUtility(int work_queen,int n, int[] queenPos){
            if(work_queen == n){
                solCtr++;
                return;
            }
            for(int col=0;col<n;col++){
                if(isSafe(work_queen,col,n,queenPos)){
                    queenPos[work_queen]=col;
                    queenUtility(work_queen+1,n,queenPos);
                    queenPos[work_queen]=-1;
                }
            }
        }
        public int totalNQueens(int n) {
            int[] queenPos=new int[n];
            Arrays.fill(queenPos,-1);
            queenUtility(0,n,queenPos);
            return solCtr;
        }

}
