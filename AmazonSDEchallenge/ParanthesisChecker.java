import java.util.Stack;
public class ParanthesisChecker {

    public static boolean isPar(String x)
    {
        
        if(x.length() == 1) return false;
        Stack<Character> st = new Stack<>();
        for(int i=0;i<x.length();i++){
               
                if(st.isEmpty()) 
                    st.push(x.charAt(i));
            
                else if((x.charAt(i) == ')' && !st.isEmpty() && st.peek() == '(' )|| x.charAt(i) == '}' && !st.isEmpty() &&  st.peek() == '{' || x.charAt(i) == ']' && !st.isEmpty() &&  st.peek() == '[')
                    st.pop();
                
                else
                    st.push(x.charAt(i));
                
            
                
        }
        
        return st.isEmpty();
        
    }
    public static void main(String[] args) {
        String x = "{()}";
        String x1 ="]]]]";
        String x2 = "{";

        System.out.println(isPar(x));
        System.out.println(isPar(x1));
        System.out.println(isPar(x2));

    }
}
