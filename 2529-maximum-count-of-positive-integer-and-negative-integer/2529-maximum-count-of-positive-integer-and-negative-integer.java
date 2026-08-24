class Solution {
    public int maximumCount(int[] nums) {
       int n = nums.length;
       int start = 0 ;
       int end = n;
       while(start<end){
        int mid = start + (end - start)/2;
        // to count last negative
        if(nums[mid]>=0) end = mid;
        else start = mid+1 ;
       }
       int negcount = end;

        start = 0 ;
        end = n;
       while(start<end){
        int mid = start + (end - start)/2;
        // to count first positive
        if(nums[mid]<=0)start = mid+1;
        else end = mid;
       }
       int poscount = n - start;
        return Math.max(negcount,poscount);
    }
    
}