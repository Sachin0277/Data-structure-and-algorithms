/*
 * Given three integers  'A' denoting the first term of an arithmetic sequence , 'C' denoting the common difference of an arithmetic sequence
 *  and an integer 'B'. you need to tell whether 'B' exists in the arithmetic sequence or not.
 *  Return 1 if B is present in the sequence. Otherwise, returns 0.
 */
public class ArithmeticNumber {
    private static int inSequence(int A,int B ,int C){
        if(C == 0){
            if(A==B) return 1;
            else return 0;
        }
        if((B-A) % C == 0){
            if((B-A) / C >= 0){
                return 1;
            }
            else return 0;
        }
        return 0;
    }
    public static void main(String args[]){
        int first = 1;
        int num = 3;
        int cd = 2;

        int ans = inSequence(first,num,cd);
        System.out.println(ans);
    }
}
