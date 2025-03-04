import java.util.*;

class Pair {
    int row;
    int col;
    int tm;

    Pair(int row, int col, int tm) {
        this.row = row;
        this.col = col;
        this.tm = tm;
    }
}

class Solution {

    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        Queue<Pair> q = new LinkedList<>();
        int[][] vis = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    q.add(new Pair(i, j, 0));
                    vis[i][j] = 2;
                } else {
                    vis[i][j] = 0;
                }
            }
        }

        int tm = 0;
        int[] drow = { -1, 0, 1, 0 };
        int[] dcol = { 0, -1, 0, 1 };

        while (!q.isEmpty()) {
            Pair p = q.poll();
            int r = p.row;
            int c = p.col;
            int t = p.tm;

            tm = Math.max(tm, t);

            for (int i = 0; i < 4; i++) {
                int nrow = r + drow[i];
                int ncol = c + dcol[i];

                if (nrow >= 0 && ncol >= 0 && nrow < m && ncol < n && vis[nrow][ncol] == 0 && grid[nrow][ncol] == 1) {
                    vis[nrow][ncol] = 2;
                    q.add(new Pair(nrow, ncol, t + 1));
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (vis[i][j]==0 && grid[i][j] == 1) {
                    return -1;
                }
            }
        }

        return tm;
    }
}