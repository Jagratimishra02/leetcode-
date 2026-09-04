class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>>ans = new ArrayList<>();  //arraylist of arraylist
        for(int i = 0 ; i < numRows ; i++){
            ans.add(new ArrayList<Integer>());
            for(int j = 0 ; j <= i ; j++){
                if(j == 0 || i == j) ans.get(i).add(1);
                 else {
                    int val = ans.get(i-1).get(j)+ans.get(i-1).get(j-1);
                    ans.get(i).add(val);
                }
            }
            
        } 
          return ans;
    }
}