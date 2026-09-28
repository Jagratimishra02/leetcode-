class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>ans = new ArrayList<>();
        helperfunction(n,0,0,ans,"");
        return ans;
    }
    public void helperfunction(int n , int left , int right ,List<String> ans,String s){
        if (s.length() ==2*n) {
           ans.add(s);
            return;
            }
        if (left<n) helperfunction(n,left+1, right,ans, s + "(");
        if (left>right)helperfunction(n,left, right+1,ans,s + ")");
    }
}