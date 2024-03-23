class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm =new HashMap<>();
        
        for(int i=0;i<strs.length;i++){
            char [] chr=strs[i].toCharArray();
            Arrays.sort(chr);
            String s=new String(chr);
            if(!hm.containsKey(s)) hm.put(s,new ArrayList<>());
            hm.get(s).add(strs[i]);
        }
        return new ArrayList(hm.values());
    }
}