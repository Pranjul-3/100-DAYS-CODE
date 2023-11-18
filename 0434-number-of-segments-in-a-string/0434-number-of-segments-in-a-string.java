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









/** class Solution {
    public int countSegments(String s) {
        s=s.trim();
        if(s.isEmpty())
        {
            return 0;
        }
        String str [] =s.split("\\s+");
        return str.length;
    }
} **/





