class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        int n = words.length;
        
        List<String> ans = new ArrayList<>();
        int start=0;
        while(start<n){
            int[] idxSum = decideLine(words, start, maxWidth, n);
            int end = idxSum[0];
            int cumSum = idxSum[1];
            ans.add(createLine(words, start, end, cumSum, maxWidth, n));
            start = end+1;
        }
        return ans;
    }
    public int[] decideLine(String[] words, int start, int maxWidth, int n){
        int cumSum = 0, spaces = 0;
        int end = start;
        
        while(end<n){
            cumSum += words[end].length();
            if(cumSum + spaces > maxWidth){
                return new int[]{end-1, cumSum - words[end].length()};
            }
            spaces++; // for space
            end++;
        }
        return new int[]{end-1, cumSum};
    }
    public String createLine(String[] words, int start, int end, int cumSum, int maxWidth, int n){
        
        int spaces = maxWidth - cumSum;
        int wordSpaces = end - start;
        int reqSpaces = (end == n-1 || end==start)? 0 : spaces / wordSpaces;
        
        StringBuilder spaceWord = new StringBuilder();
        while(reqSpaces>0){
            spaceWord.append(' ');
            reqSpaces--;
        }
        
        int extraSpacing = (end == n-1 || end==start)? spaces : spaces % wordSpaces;
        
        StringBuilder sb = new StringBuilder();
        
        while(sb.length() !=  maxWidth){
            
            if(start <= end)
                sb.append(words[start]);
            
            if(start++ < end)
                sb.append(spaceWord);//only if the word is not the end
            
            if(extraSpacing>0){
                sb.append(' ');//adding the extra spaces!
                extraSpacing--;
            }
        }
        return sb.toString();
    }
}