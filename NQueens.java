import java.util.*;
public class NQueens {
    static int ctr=0;
    public static List<String> construct(int[] queen_pos,int n){
        List<String> solution = new ArrayList<>();
        for(int row=0;row<n;row++){
            String rowAdd = "";
            for(int col=0;col<n;col++){
                if(queen_pos[row]==col){
                    rowAdd=rowAdd+"Q";
                }
                else{
                    rowAdd=rowAdd+".";
                }
            }
            solution.add(rowAdd);
        }
        return solution;
    }
        public static int isSafe(int check_row, int check_col ,int n, int[]queen_pos){
            int row,col;
            //left top checking
            for(row=check_row-1,col=check_col-1; row>=0 && col>=0; row--,col--){
                if(queen_pos[row]==col) return 0;
            }
            //top checking
            for(row=check_row-1,col=check_col; row>=0; row--){
                if(queen_pos[row]==col) return 0;
            }
            //right top
            for(row=check_row-1,col=check_col+1; row>=0 && col<n; row--,col++){
                if(queen_pos[row]==col) return 0;
            }
            return 1;
        }
        // List<List<String>> result
        public static void queenUtility(int work_queen,int n,int[] queen_pos,List<List<String>> result){
            int col;

            if(work_queen == n){
                ctr++;
                result.add(construct(queen_pos,n));
                return;
            }
            for(col = 0;col<n;col++){
                if(isSafe(work_queen,col,n,queen_pos)==1){
                    queen_pos[work_queen]=col;
                    queenUtility(work_queen+1,n,queen_pos,result);
                    queen_pos[work_queen]=-1;
                }
            }
        }

        public static void main(String[] args) {
            int n=1;
            int[] queen_pos=new int[n];
            Arrays.fill(queen_pos, -1);
            List<List<String>> result = new ArrayList<>();
            queenUtility(0,n,queen_pos,result);
            System.out.println(result);
            System.out.println(ctr);
        }
}
