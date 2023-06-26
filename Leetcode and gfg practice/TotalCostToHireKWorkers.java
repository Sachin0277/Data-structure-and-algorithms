import java.util.*;
public class TotalCostToHireKWorkers {

    private static long totalCost(int costs[],int k,int candidates){
        int l = 0,r = costs.length-1;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> (costs[a]-costs[b] != 0 ? costs[a]-costs[b] : a-b));
        for(int i=0;i<candidates && l<=r ;i++){
            pq.add(l++);
            if(l <= r) pq.add(r--);
        }
        long ans = 0;
        while(k-- > 0){
            int ind = pq.poll();
            if(l <= r && l < costs.length && r >= 0){
                if(ind <= l) pq.add(l++);
                else pq.add(r--);
            }
            ans += costs[ind];
        }
        return ans;
    }
    public static void main(String args[]){
        int []costs = {17,12,10,2,7,2,11,20,8};
        int k = 3;
        int candidates = 4;
        System.out.println(totalCost(costs,k,candidates));

     }


}
