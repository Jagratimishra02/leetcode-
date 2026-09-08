class Solution {
    public boolean isPalindrome(int x) {     // time complexity = O(n)
         if(x < 0) return false;
        int rev = 0 ;       // reverse 
        int og = x;          // orignal
        while(x > 0){
            int rem = x % 10;
            rev = rev*10+ rem ;
            x /= 10;
        }
        if(og != rev) return false;
        else return true;
    }
}