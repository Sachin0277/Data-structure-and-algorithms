import java.util.HashMap;
public class SpecialSubarray {
    public static int[] specialSubarray(int n, int[] arr) {
		// Write your code here.
		//first of all we need to find the maxfrequent element
		HashMap<Integer,Integer> map = new HashMap<>();
		HashMap<Integer,Integer> left = new HashMap<>();
		int maxFreq = Integer.MIN_VALUE;
		int minLen = 0;
		int startInd = 0;
		for(int i=0;i<n;i++){
			int x = arr[i];
			if(!map.containsKey(x)){
				left.put(x,i);
				map.put(x,1);
			}
			else{
				map.put(x,map.get(x)+1);
			}
			if(map.get(x) > maxFreq){
				maxFreq = map.get(x);
				minLen = (i-left.get(x)+1);
				startInd = left.get(x);
			}
			if(map.get(x) == maxFreq && (i-left.get(x)+1) < minLen){
				minLen = i-left.get(x)+1;
				startInd = left.get(x);
			}
		}
		int ans[] = new int[minLen];
		int j = 0;
		for(int i=startInd;i<startInd+minLen;i++){
			ans[j++] = arr[i];
			
		}
		return ans;
	}
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,4,3,6,7};
        int ans[] = specialSubarray(arr.length,arr);
        for(int ele : ans){
            System.out.print(ele+" ");
        }

    }
}
