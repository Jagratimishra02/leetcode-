class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] c = new int [m+n];
        Mergetwo(c ,nums1, m,nums2,n);
         for(int idx = 0; idx < m+n; idx++){
         nums1[idx] = c[idx];
    }
        for(int i : c){
            System.out.print(i);
        }
         System.out.println();
    }
    public void Mergetwo(int [] c ,int[] nums1, int m, int[] nums2, int n){
        int i = 0,j = 0,k = 0;
        while(i < m && j  < n){
            if(nums1[i]<nums2[j]){
              c[k++] = nums1[i++];  
            } else {
              c[k++] = nums2[j++];
            }
        }
        while(i < m){
            c[k++] = nums1[i++];
        } 
        while(j < n){
            c[k++] = nums2[j++];
        } 
    }
}