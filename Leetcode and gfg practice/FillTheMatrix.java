import java.util.LinkedList;
import java.util.Queue;

/*
 * Given a matrix with dimensions N x M, entirely filled with zeroes except for one position at co-ordinates X and Y containing '1'.
 * Find the minimum number of iterations in which the whole matrix can be filled with ones.
 * Note: In one iteration, '1' can be filled in the 4 neighbouring elements of a cell containing '1'.
 */


 public class FillTheMatrix {

  //function for finding the minimum iterations to fill the whole matrix with one
  //Intuition behind is the breadth first search 
  private static int minIterations(int n,int m,int x,int y){
    //create a variable to store minimum number of iterations required to fill the matrix
    int minIter = 0;
    //create 2-D matrix of size n*m
    int mat[][] = new int[n][m];
    x = x-1;
    y = y-1;
    mat[x][y] = 1;
    //Inorder to perform breadth first search queue data structure is needed (for iterative bfs)
    Queue<int[]> q = new LinkedList<>();
    q.offer(new int[]{x,y});
    while(!q.isEmpty()){
        int sz = q.size();
        for(int i=0;i<sz;i++){
            int[] cur = q.poll();
            int curX = cur[0];
            int curY = cur[1];
            int dirs[][] = {{1,0},{-1,0},{0,1},{0,-1}};
            for(int dir[] : dirs){
                int newX = curX+dir[0];
                int newY = curY+dir[1];
                //check the boudary condition and if mat[newX][newY] is equal to zero then mark it is one and add the new_x and new_y to the queue;
                if(newX >= 0 && newX < n && newY >=0 && newY < m && mat[newX][newY] == 0){
                    mat[newX][newY] = 1;
                    q.offer(new int[]{newX,newY});
                }
            }
        }
        minIter++;
    }
    return minIter-1;
  }

  //This problem can be solved using mathematics 
  private static int minIter(int n,int m,int x,int y){
    return Math.max(x-1,n-x)+Math.max(y-1,m-y);
  }
    
   public static void main(String args[]){
    // Input Test - 1
    int n = 2;
    int m = 3;
    int x = 2;
    int y = 3;

    // Input Test - 2
    int n1 = 1;
    int m1 = 1;
    int x1 = 1;
    int y1 = 1;
    //output
    int ans = minIterations(n,m,x,y);
    int ans1 = minIterations(n1,m1,x1,y1);
    System.out.println("Using Breadth First Search");
    System.out.println(ans1);
    System.out.println(ans);
    System.out.println("Using Mathematics");
    System.out.println(minIter(n1, m1, x1, y1));
    System.out.println(minIter(n, m, x, y));
   }
    
 }
 