class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int drop = 0;
       for(int i = 0 ; i < n ; i++) {
        if(nums[(i+1) % n]< nums[i]){
            drop++;
        }
       }
       if(drop>1){
        return false;
       }
       return true;
    }
}