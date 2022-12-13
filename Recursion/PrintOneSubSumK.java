import java.util.ArrayList;

public class PrintOneSubSumK{
    private static boolean subSumK(int i,ArrayList<Integer> res,int s,int arr[],int sum ,int n){
        if(i == n){
            if(s == sum && res.size()>0){
                System.out.println(res);
                return true;
            }
            return false;
        }
        res.add(arr[i]);
        s += arr[i];
        if(subSumK(i+1, res, s, arr, sum, n)) return true;
        res.remove(res.size()-1);
        s -= arr[i];
        if(subSumK(i+1, res, s, arr, sum, n)) return true;
        return false;

    }
    public static void main(String args[]){
        int n = 3;
        int arr[] = new int[]{1,2,1};
        int sum = 2;
        ArrayList<Integer> res = new ArrayList<>();
        subSumK(0,res,0,arr,sum,n);

    }
}