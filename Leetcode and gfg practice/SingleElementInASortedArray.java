public class SingleElementInASortedArray {
    private static int singleNonDuplicate(int nums[]){
        /*
         * Can be solved in O(n) using xor operator 
         * xor properties is that if two elements are same then xor of that will be zero and xor of any element with zero will give the same element
         * 
         * int ans = 0;
         * for(int i:nums){
         *  ans ^= i;
         * }
         * return ans;
         */

         /*
          * But here it is mentioned to solve it in O(logn) time 
          Intuition : Arrays are sorted so binary search can be used lets implement it
          */
          int low = 0,  high = nums.length-1;
          while(low < high){
            int mid = (low)+(high-low)/2;
            //we know that if one element will always be at even index if array contains a pair of elements
            if(mid % 2 == 1) mid--;
            // Not found a pair 
            if(nums[mid] != nums[mid+1]) high = mid;
            else low = mid+2; // found a pair 
          }
          //return the nums at low
          return nums[low];
    }
    public static void main(String args[]){
        int nums[] = {1,1,2,3,3,4,4};
        System.out.println(singleNonDuplicate(nums));
    }
}
