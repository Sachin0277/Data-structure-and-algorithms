import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KnightInGeekLand {
    static class Pair{
        int first;
        int second;
        Pair(int first , int second){
            this.first = first;
            this.second = second;
        }
    }
    public static int knightInGeekland(int arr[][], int start_x, int start_y){
        int m = arr.length;
        int n = arr[0].length;
        
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(start_x,start_y));
        
        boolean vis[][] = new boolean[m][n];
        vis[start_x][start_y] = true;
        List<Integer> coins = new ArrayList<>();
        int dx[] = {-2,-2,-1,-1,1,1,2,2};
        int dy[] = {-1,1,-2,2,2,-2,1,-1};
        
        while(!q.isEmpty()){
            int sz = q.size();
            int coinsInThisStep = 0;
            while(sz-- > 0){
                Pair node = q.poll();
                int curX = node.first;
                int curY = node.second;
                coinsInThisStep += arr[curX][curY];
                for(int dir = 0;dir < 8;dir++){
                    int newX = curX + dx[dir];
                    int newY = curY + dy[dir];
                    
                    if(newX >= 0 && newY >= 0 && newX < m && newY < n && !vis[newX][newY]){
                        vis[newX][newY] = true;
                        q.add(new Pair(newX,newY));
                    }
                }
            }
            coins.add(coinsInThisStep);
        }
        int size = coins.size();
        int maxi = Integer.MIN_VALUE;
        int ans = 0;
        for(int i=size-1;i>=0 ;i--){
            if(coins.get(i)+i < size){
                coins.set(i,coins.get(i)+coins.get(coins.get(i)+i));
            }
            if(coins.get(i) >= maxi){
                maxi =coins.get(i);
                ans = i;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[][] = {{7, 6, 8},
                       {9, 1, 4},
                       {6, 2, 8}};
        int start_x = 2;
        int start_y = 1;
        int a = knightInGeekland(arr,start_x,start_y);
        System.out.println(a);
    }
}
