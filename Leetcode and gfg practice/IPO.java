import java.util.PriorityQueue;

public class IPO {

    private static int maximizedCapital(int k,int w, int[] profits,int[] capital){

        //we have to take maximum profit and minimum capital so inorder to take specified profit and capital we can using heap datastructure
        
        //maxheap for profit and minheap for capital
        PriorityQueue<int[]> cap = new PriorityQueue<>((a,b)->(a[0]-b[0]));
        PriorityQueue<int[]> pro = new PriorityQueue<>((a,b)->(b[1]-a[1]));

        //insert data into heap
        for(int i=0;i<capital.length;i++){
            cap.add(new int[]{capital[i],profits[i]});
        }

        //for taking only k distinct projects
        for(int i=0;i<k;i++){
            //condition satified add popped from cap to pro 
            while(!cap.isEmpty() && cap.peek()[0] <= w){
                pro.add(cap.poll());
            }
            //if pro is empty break
            if(pro.isEmpty()) break;
            
            w += pro.poll()[1];


        }
        return w;
    }
    public static void main(String arg[]){
        int k = 2;
        int w = 0;
        int[] profits = {1,2,3};
        int[] capital = {0,1,1};

        System.out.println(maximizedCapital(k,w,profits,capital));
    }
}
