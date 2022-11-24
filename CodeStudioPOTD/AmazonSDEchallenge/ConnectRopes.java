
import java.util.PriorityQueue;

public class ConnectRopes {
    private static int connectRopes(int[] lengths){
        int n = lengths.length;
        if(n <= 1){
            return 0;
        }
        int minCost = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int length: lengths){
            minHeap.add(length);
        }
        while(minHeap.size() > 1){
            int a = minHeap.poll();
            int b = minHeap.poll();

            minCost += a+b;
            minHeap.add(a+b);
        }
        return minCost;
    }
    public static void main(String args[]){
        int lengths[] = {4,3,2,6};
        System.out.println("The minimum cost to connect all the ropes into one is: "+connectRopes(lengths));
    }
}
