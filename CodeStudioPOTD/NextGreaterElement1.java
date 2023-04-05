import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement1 {


    private static int[] nextGreaterElement(int n,int a[],int m,int b[]){
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=m-1;i>=0;i--){
            while(!st.isEmpty() && st.peek() <= b[i]){
                st.pop();
            }
            int r = st.isEmpty()? -1 : st.peek();
            map.put(b[i],r);
            st.push(b[i]);
        }
        int i = 0;
        int ans[] = new int[n];
        for(int ele : a){
            ans[i++] = map.get(ele);
        }
        return ans;
    }
    public static void main(String args[]){
        int a[] = {1,2,0,3,4,5};
        int b[] = {3,5,0,2,1,6,4};
        int n = a.length;
        int m = b.length;

        // call the function 
        int ans[] = nextGreaterElement(n,a,m,b);
        for(int ele : ans){
            System.out.print(ele+ " ");
        }
    }
    
}
