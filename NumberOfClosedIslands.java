public class NumberOfClosedIslands {
        boolean closed(int i, int j, int[][] grid){
            int r=grid.length;
            int c=grid[0].length;
            if(grid[i][j]==1) return true;
            if(i==0 || i==r-1 || j==0 || j==c-1) return false;
            grid[i][j]=1;
            boolean left =closed(i,j-1,grid);
            boolean right =closed(i,j+1,grid);
            boolean up =closed(i-1,j,grid);
            boolean down =closed(i+1,j,grid);
            return left && right && up && down;
        }
        public int closedIsland(int[][] grid) {
            int r= grid.length;
            int c= grid[0].length;
            int count=0;
            for(int i=1;i<r-1;i++){
                for(int j=1;j<c-1;j++){
                    if(grid[i][j]==0){
                        if(closed(i,j,grid)){
                            count++;
                        }
                    }
                }
            }
            return count;
        }

}
