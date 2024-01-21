class Solution {
    public int distanceTraveled(int m, int a) {
        int ans=0;
        if(m<5)
            ans= m*10;
        else{
            while(m>0){
                if(m>=5){
                m=(m-5);
                ans+=(5*10);
                    if(a>=1){
                        m+=1;
                        a-=1;
                    }
                }
                else{
                    ans+=m*10;
                    m=0;
                }
            }
        }
        return ans;
    }
}