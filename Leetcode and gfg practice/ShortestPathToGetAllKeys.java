import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathToGetAllKeys {
    private static int dirs[][]=
    {{1,0},{0,1},{0,-1},{-1,0}};

    static class GridNode {
        int row;
        int col;
        String key;

        GridNode(int row, int col, String key) {
            this.row = row;
            this.col = col;
            this.key = key;
        }

        public String toString(int r, int c, String k) {
            return r + "-" + c + "-" + k;
        }
    }

    public static int shortestPathAllKeys(String grid[]) {
        Queue<GridNode> q = new LinkedList<>();
        HashSet<String> vis = new HashSet<>();
        int n = grid.length;
        int m = grid[0].length();
        int keyCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char ch = grid[i].charAt(j);
                if (ch == '@')
                    q.offer(new GridNode(i, j, ""));
                if (ch >= 'a' && ch <= 'f') {
                    keyCount++;
                }
            }
        }

        int steps = 0;
        while (!q.isEmpty()) {
            int sz = q.size();
            for (int x = 0; x < sz; x++) {
                GridNode cur = q.poll();
                int i = cur.row;
                int j = cur.col;
                String key = cur.key;
                if (!vis.contains(cur.toString(i, j, key))) {
                    vis.add(cur.toString(i, j, key));
                } else {
                    continue;
                }
                if (key.length() == keyCount) {
                    return steps;
                }
                // Now let's move in each four possible directions
                for (int d[] : dirs) {
                    int newRow = i + d[0];
                    int newCol = j + d[1];
                    GridNode newGridNode = new GridNode(newRow, newCol, key);
                    // check for boundary conditions
                    if (newRow < 0 || newRow >= n || newCol < 0 || newCol >= m || grid[newRow].charAt(newCol) == '#'
                            || vis.contains(newGridNode.toString(newRow, newCol, key))) {
                        continue;
                    }
                    char ch = grid[newRow].charAt(newCol);
                    if(key.indexOf(ch) == -1 && ch >= 'a' && ch<='f'){
                        q.add(new GridNode(newRow, newCol, key+ch));
                    }
                    if(ch >='A' && ch<='F' && key.indexOf(Character.toLowerCase(ch)) == -1){
                        continue;
                    }
                    else{
                        q.add(new GridNode(newRow, newCol, key));
                    }
                }
            }
            steps++;
        }
        return -1;
    }

    public static void main(String args[]) {
        String grid[] = { "@..aA", "..B#.", "....b" };
        String grid1[]= {"@.a..","###.#","b.A.B"};
        System.out.println(shortestPathAllKeys(grid));
        System.out.println(shortestPathAllKeys(grid1));
    }
}
