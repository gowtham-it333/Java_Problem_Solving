public class MaxAreaofIsland {

        public int bfs(int i, int j, boolean[][] visit, int[][] grid){
            int r = grid.length;
            int c = grid[0].length;
            visit[i][j]=true;
            Queue<int[]> q = new LinkedList<>();
            int[] pair = {i,j};
            q.add(pair);

            int area=0;
            while(!q.isEmpty()){
                int[] temp = q.remove();
                int row = temp[0];
                int col = temp[1];
                area++;
                for(int delrow=-1; delrow<=1; delrow++){
                    int curow = row + delrow;
                    if(curow>=0 && curow<r && col>=0 && col<c && grid[curow][col]==1 && !visit[curow][col]){
                        visit[curow][col]=true;
                        int[] p ={curow,col};
                        q.add(p);
                    }
                }
                for(int delcol=-1; delcol<=1 ; delcol++){
                    int curcol=col + delcol;
                    if(row>=0 && row<r && curcol>=0 && curcol<c && grid[row][curcol]==1 && !visit[row][curcol])
                    {
                        visit[row][curcol]=true;
                        int[] p = {row,curcol};
                        q.add(p);
                    }
                }
            }
            return area;
        }
        public int maxAreaOfIsland(int[][] grid) {
            int r = grid.length;
            int c = grid[0].length;
            boolean[][] visit = new boolean[r][c];
            for(int i=0;i<r;i++){
                Arrays.fill(visit[i],false);
            }
            int maxArea=0;

            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    if(!visit[i][j] && grid[i][j]==1){
                        maxArea = Math.max(maxArea,bfs(i,j,visit,grid));
                    }
                }
            }
            return maxArea;
        }

}
