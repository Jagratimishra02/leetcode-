class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int i = 0 ;
        while(i < nums.length){
            int j = nums[i]-1;
            if(nums[i] == i+1 || nums[i] == nums[j]) i++ ;
            else {
                swap(i,j,nums);
            }
        }
        for(i = 0; i<nums.length; i++){
            if(nums[i] != i+1) ans.add(i+1);
        }
        return ans;
    }
    public static void swap(int i , int j, int []nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}