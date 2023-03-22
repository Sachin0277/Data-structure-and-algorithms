public class MinimumScoreOfAPath {
    private static int[] root, rank;
    
    private static int find(int x){
        if(x == root[x])
            return root[x];
        return root[x] = find(root[x]);
    }
    
    private static void createUnion(int x, int y){
        int rootX = find(x);
        int rootY = find(y);
        if(rootX == rootY)
            return;
        if(rank[rootX] < rank[rootY])
            root[rootX] = rootY;
        else if(rank[rootX] > rank[rootY])
            root[rootY] = rootX;
        else{
            root[rootY] = rootX;
            rank[rootX]++;
        }
    }
    
    private static int minScore(int n, int[][] roads) {
        root = new int[n + 1];
        rank = new int[n + 1];
        for(int i = 0; i < n; i++){
            root[i] = i;
            rank[i] = 0;
        }
        int minScore = Integer.MAX_VALUE;
        for (int[] road : roads) {
            createUnion(road[0], road[1]);
        }
        for (int[] road : roads) {
            int root1 = find(1);
            int rootX = find(road[0]);
            int rootY = find(road[1]);
            if (root1 == rootX && root1 == rootY) {
                minScore = Math.min(minScore, road[2]);
            }
        }
        return minScore;
    }
    public static void main(String[] args) {
        int n = 4;
        int[][] roads = {{1,2,9},{2,3,6},{2,4,5},{1,4,7}};
        int ans = minScore(n,roads);
        System.out.println(ans);
    }
}