class Solution {
    public int missingNumber(int[] nums) {  
    int i = 0 ;
    int n = nums.length;
    while(i<nums.length){
        if(nums[i] == i || nums[i] == n) i++;
        else {
            int idx = nums[i];
            swap(i,idx,nums);
        }
     }
     for(i = 0 ; i < nums.length ; i++){
        if(nums[i] != i) return i ;
     }
     return n ;
   }
   public static void swap(int i , int idx ,int []nums){
     int temp = nums[i];
     nums[i] = nums[idx];
     nums[idx] = temp;
   
    }
}