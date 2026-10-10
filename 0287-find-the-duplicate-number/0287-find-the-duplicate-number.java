class Solution {
    public int findDuplicate(int[] nums) {
        // method 1
        // int n = nums.length-1 ;
        // for(int i = 0 ; i <= n ; i++){
        //     for(int j = i+1 ; i < n-2 ; j++){
        //         if(nums[i]== nums[j]){
        //             return nums[i];
        //         }
        //     }
        // }return 1 ;

        // method 2 using cyclic sort . time complexity = O(nlogn).
        int i = 0 ;
        while(i < nums.length){
            int idx = nums[i]-1;
            if(nums[i] != i+1){
                if(nums[i] == nums[idx] ) {
                    return nums[i] ;  // duplicate found
                }
                swap(i, idx, nums);
            }else {
                i++;
            } 
        }
        return -1;
    } 
     public static void swap(int i , int idx , int []nums){
            int temp = nums[i];
            nums[i] = nums[idx];
            nums[idx] = temp;
    } 
}
