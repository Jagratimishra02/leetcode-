class Solution {
    public int singleNonDuplicate(int[] nums) {
       int n = nums.length;
       // if nums.length = 1;
       if(nums.length == 1) return nums[0];
       // if first element is single
       if(nums[0] != nums[1]) return nums[0];
       // if last element is single
       if(nums[n-1] != nums[n-2]) return nums[n-1];
       int start = 0 ;
       int end = n-1;
       while(start<= end) {
        int mid = start + (end-start)/2 ;
        if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]) return nums[mid];
           int first = mid ;
           int second = mid;
        if(nums[mid]== nums[mid+1]) second=mid+1;
        else first=mid-1;
        int leftcount = first + start;
        int rightcount = end - second;
        // if leftcount = even ,go right 
        if(leftcount%2 == 0) start = second+1;
        // if rightcount = even ,go left 
        else end = first-1;
       }
       return -1 ;
    }
}