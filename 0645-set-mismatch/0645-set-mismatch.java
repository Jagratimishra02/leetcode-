class Solution {
    public int[] findErrorNums(int[] nums) {
        int []ans = new int[2];
        int i = 0 ;
        while(i < nums.length){
            int j = nums[i]-1;
            if(nums[i] == i+1 || nums[i] == nums[j]) i++ ; // if num is at correct position or repeated
            else {
                swap(i,j,nums);
            }
        }
        for(i = 0; i<nums.length; i++){
            if(nums[i] != i+1) {
                ans[0] = nums[i];
                ans[1] = i+1;
            }
        }
        return ans;
    }
    public static void swap(int i , int j, int []nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}