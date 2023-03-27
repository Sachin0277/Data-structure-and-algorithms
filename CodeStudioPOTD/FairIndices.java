

public class FairIndices {

        private static int totalIndexes(int a[],int b[]){
            //create prefix sum for both arrays 
            int n = a.length;
            int preA[] = new int[n];
            int preB[] = new int[n];
            preA[0] = a[0];
            preB[0] = b[0];
            for(int i=1;i<n;i++){
                preA[i] = preA[i-1]+a[i];
                preB[i] = preB[i-1]+b[i];
            }
            int count = 0;
            for(int i=0;i<n-1;i++){
                if(preA[i] == preB[i] && preA[n-1] == 2*preA[i] && preB[n-1] == 2*preB[i]){
                    count++;
                }
            }
            return count;
        }
        public static void main(String args[]){
            int a[] = {1 ,4 ,2, -2, 5 };
            int b[] = {7 ,-2 ,-2 ,2 ,5};
            int ans = totalIndexes(a,b);
            System.out.println(ans);
        }
}
