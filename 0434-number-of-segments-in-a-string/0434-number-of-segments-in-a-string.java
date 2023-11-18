class Solution {
    public int countSegments(String s) {
        String str [] = s.split(" ");
        int c=0;
        for(String w:str)
        {
            if(!w.isEmpty())
            c++;
        }
        return c;
    }
}







