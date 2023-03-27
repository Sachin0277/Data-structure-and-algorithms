import java.util.HashSet;
public class MaxLength {

    private  static int maxLength(int []a) {
        // Write your code here.
        HashSet<Integer> st = new HashSet<>();
        for(int i=0;i<a.length;i++){
            st.add(a[i]);
        }
        return st.size();
    }
    public static void main(String[] args) {
        int a[] = {1,3,2,3,4};
        System.out.println(maxLength(a));
    }
}
