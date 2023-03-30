import java.util.Arrays;

public class MultiplyPolynomials {
    private static int[] multiplyPolynomials(int a[],int b[],int n){
        int prod[] = new int[2*n-1];
        Arrays.fill(prod, 0);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                prod[i+j] += a[i]*b[j];
            }
        }
        return prod;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3};
        int b[] = {3,2,1};
        int n = a.length;
        int []ans = multiplyPolynomials(a,b,n);
        for(int ele : ans){
            System.out.print(ele + " ");
        }
    }
}
