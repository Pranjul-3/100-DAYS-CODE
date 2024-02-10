class Solution {
    public List<String> restoreIpAddresses(String s) {
       List<String> ans = new ArrayList<>();
        helper(0, 0, "", s, ans);
        return ans;
    }
    void helper(int i, int par, String ans, String s, List<String> res){
        if(i==s.length() && par==4){
            res.add(ans.substring(0, ans.length()-1));
        }
        if(i+1<=s.length()){
            helper(i+1, par+1, ans+s.substring(i, i+1)+".", s, res);
        }
        if(i+2<=s.length() && isValid(s.substring(i,i+2))){
            helper(i+2, par+1, ans+s.substring(i, i+2)+".", s, res);
        }
        if(i+3<=s.length() && isValid(s.substring(i, i+3))){
            helper(i+3, par+1, ans+s.substring(i, i+3)+".", s, res);
        }
    }

    boolean isValid(String s){
        if(s.charAt(0) == '0'){
            return false;
        }
        int val = Integer.parseInt(s);
        return val<=255;
    }

}