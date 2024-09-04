public class LongestIncreasingPath {

        public int pathTraverse(int i, int j, int[][] matrix, int[][] countMatrix){
            int r= matrix.length;
            int c= matrix[0].length;
            if(i<0 || j<0 || i>=r || j>=c){
                return 0;
            }
            if(countMatrix[i][j]>0) return countMatrix[i][j];
            int max=1;
            // Left side
            if(j-1>=0 && j-1<c && matrix[i][j-1]>matrix[i][j]){
                max = Math.max(max, 1+pathTraverse(i,j-1,matrix,countMatrix));
            }
            // Right side
            if(j+1>=0 && j+1<c && matrix[i][j+1]>matrix[i][j]){
                max = Math.max(max, 1+pathTraverse(i,j+1,matrix,countMatrix));
            }
            // Up side
            if(i-1>=0 && i-1<r && matrix[i-1][j]>matrix[i][j]){
                max = Math.max(max, 1+pathTraverse(i-1,j,matrix,countMatrix));
            }
            // Down side
            if(i+1>=0 && i+1<r && matrix[i+1][j] > matrix[i][j]){
                max=Math.max(max, 1+ pathTraverse(i+1,j,matrix,countMatrix));
            }
            countMatrix[i][j]=max;
            return max;
        }

        public int longestIncreasingPath(int[][] matrix) {
            int r = matrix.length;
            int c = matrix[0].length;
            int[][] countMatrix =new int[r][c];
            for(int i=0;i<r;i++){
                Arrays.fill(countMatrix[i],-1);
            }
            int max=0;

            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    max= Math.max(max, pathTraverse(i,j,matrix,countMatrix));
                }
            }
            return max;
        }

}
