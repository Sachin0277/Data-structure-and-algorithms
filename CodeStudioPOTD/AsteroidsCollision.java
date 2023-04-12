import java.util.ArrayList;
import java.util.Stack;
import java.util.Collections;

public class AsteroidsCollision {

    public static ArrayList<Integer> collidingAsteroids(ArrayList<Integer> asteroids) 
    {
       ArrayList<Integer> ans = new ArrayList<>();
       Stack<Integer> st = new Stack<>();
       for(int i=0;i<asteroids.size();i++){
           if(st.isEmpty()){
               st.push(asteroids.get(i));
               continue;
           }
           int a1 = st.peek();
           int a2 = asteroids.get(i);
           if(a1 > 0 && a2 < 0){
               if(Math.abs(a1) < Math.abs(a2)){
                   st.pop();
                   i--;
               }
               else if(Math.abs(a1) == Math.abs(a2)){
                   st.pop();
               }
           }
           else{
               st.push(asteroids.get(i));
           }
       }
       while(!st.isEmpty()){
           ans.add(st.pop());
       }
        Collections.reverse(ans);
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> asteroids = new ArrayList<>();
        asteroids.add(3);
        asteroids.add(4);
        asteroids.add(5);
        asteroids.add(-2);
        asteroids.add(7);
        ArrayList<Integer> ans = collidingAsteroids(asteroids);
        // print the result
        for(int ele : ans ){
            System.out.print(ele + " ");
        }
    }
}
