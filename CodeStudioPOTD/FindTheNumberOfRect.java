public class FindTheNumberOfRect {
    private static int countRect(int n){
        int numOfRectangle = (n*(n+1)/2)*(n*(n+1)/2);
        int numOfSquares = (n*(n+1)*(2*n+1)/6);
        return numOfRectangle - numOfSquares;
    }
    public static void main(String args[]){
        int n = 4;
        System.out.println("The Total Number of rectangle in N*N chess board is :" + countRect(n));
    }
}
