class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
         int n = s.length();
      Set<String> wordSet = new HashSet<>(wordDict);

        
        List<List<String>> dp = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            dp.add(new ArrayList<>());
        }

        
        dp.get(0).add("");

        for (int i = 1; i <= n; i++) {
            List<String> temp = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                String suffix = s.substring(j, i);
                
                if (wordSet.contains(suffix)) {
                    
                    for (String substring : dp.get(j)) {
                       
                        temp.add(substring + (substring.isEmpty() ? "" : " ") + suffix);
                    }
                }
            }
            dp.set(i, temp);
        }

        
        return dp.get(n);
    }   
    }