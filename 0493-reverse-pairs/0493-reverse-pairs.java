class Solution {
    static int count;
    public int reversePairs(int[] nums) {
      count = 0;
      mergesort(nums);
      return count;
    } 
    public static void mergesort(int []nums){
        int n = nums.length;
        if(n <= 1) return; 
        int idx = 0;
        // divide the array into a and 
        int []a = new int[n/2];
        int []b = new int[n - n/2];
        // copy the elements of nums to a and b.
        for(int i = 0 ; i < a.length ; i++) a[i] = nums[idx++];
        for(int j = 0 ; j < b.length ; j++) b[j] = nums[idx++];
        // recursion till elements in nums is 1 of a and b.
        mergesort(a);
        mergesort(b);
        merge(a,b,nums);
    }
    public static void merge(int[] a , int[] b , int [] nums){
        int j = 0;
        for(int i = 0 ; i < a.length; i++){
            while( j < b.length && (long)a[i] > 2L * b[j]) j++;
            count += j;
        }
        int i = 0, k =0;
        j = 0;
        while(i<a.length && j<b.length){
            if(a[i] > b[j]) nums[k++] = b[j++];
            else nums[k++] = a[i++];
        }
        while(i<a.length) nums[k++] = a[i++];
        while(j<b.length) nums[k++] = b[j++];
    }
}