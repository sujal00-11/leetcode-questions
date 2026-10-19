class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        boolean[][] visited = new boolean[m][n];
        
        int r = 0;
        int c = 0;
        visited[r][c] = true;
        
        while (true) {
            char dir = grid[r][c];
            int nextR = r;
            int nextC = c;
            
            if (dir == 'L') {
                nextC--;
            } else if (dir == 'R') {
                nextC++;
            } else if (dir == 'U') {
                nextR--;
            } else if (dir == 'D') {
                nextR++;
            }
            
            
            if (nextR < 0 || nextR >= m || nextC < 0 || nextC >= n || visited[nextR][nextC]) {
                return new int[]{r, c};
            }
            
            r = nextR;
            c = nextC;
            visited[r][c] = true;
        }
    }
}