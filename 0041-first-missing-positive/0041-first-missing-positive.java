class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0 ;
        int n = nums.length;
        while(i < n){
            int j = nums[i]-1;
            // check 4 conditions , if num is negative, if greater then n , if at correct place , if duplicate no need to swap.
            if(nums[i] <= 0 || nums[i] > n || nums[i] == i+1 || nums[i] == nums[j]) i++;
            else swap(i,j,nums);
        }
         for(i = 0; i<nums.length; i++){
            if(nums[i] != i+1) return i+1;
        }
        return n+1;
    }
    public static void swap(int i , int j, int []nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}