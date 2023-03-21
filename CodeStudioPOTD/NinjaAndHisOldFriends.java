public class NinjaAndHisOldFriends {

    private static int shakeHands(int arr[],int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == k){
                k *= 2;
            }
        }
        return k;
    }
    public static void main(String args[]){
        int friends[] = new int[]{1,2,4};
        int k = 1;
        //calling the function
        int ans =  shakeHands(friends,k);
        System.out.println(ans);

    }
}
