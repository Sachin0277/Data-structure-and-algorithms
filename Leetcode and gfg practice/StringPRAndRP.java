import java.util.Stack;
public class StringPRAndRP {

    private static long[] getElement(char c1, char c2,String s){
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
	    st1.add(s.charAt(0));
	    long cnt1 = 0,cnt2 = 0;
	    char temp = s.charAt(0);
	    for(int i=1;i<s.length();i++){
	        if(!st1.isEmpty() && s.charAt(i) == c2 && st1.peek() == c1){
	            st1.pop();
	            cnt1++;
	        }
	        else{
	            st1.add(s.charAt(i));
	        }
	    }
	   st2.add(st1.pop());
	   temp = st2.peek();
	   while(!st1.isEmpty()){
	       if(!st2.isEmpty() && st1.peek() == c2 && st2.peek() == c1){
	           st2.pop();
	           cnt2++;
	       }
	       else{
	           st2.add(st1.peek());
	       }
	       st1.pop();
	   }
	   
	   if(c1 == 'p') return new long[]{cnt1,cnt2};
	   else return new long[]{cnt2,cnt1};
	   
    }

    static long solve(int x,int y, String s)
	{    
	    // code here
	    
	    long ele[];
	    if(x > y){
	        ele = getElement('p','r',s);
	        
	    }
	    else{
	        ele = getElement('r','p',s);
	    }
	    
	    return ele[0]*x+ele[1]*y;
	    
        
	}
    public static void main(String args[]){
        String s = "abppprrr";
        int X = 5;
        int Y = 4;

        //call the function 
        long ans = solve(X,Y,s);
        System.out.println(ans);
    }
}
