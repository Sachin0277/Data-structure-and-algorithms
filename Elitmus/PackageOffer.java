
import java.util.*;
public class PackageOffer {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int prices[] = {2,2,2};
        Arrays.sort(prices); // sort the array in non-decreasing order
        long revenue = 0; // use long to avoid integer overflow
        for (int i = n-1; i >= 0; i--) {
            revenue += (long) prices[i] * (i+1); // multiply price with remaining offers
        }
        System.out.println(revenue);
        
       
    }
}
