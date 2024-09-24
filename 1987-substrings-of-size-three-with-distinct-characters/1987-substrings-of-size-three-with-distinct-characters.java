class Solution {
    public int countGoodSubstrings(String s) {
        int res=0;
        if(s.length()<3)
        {
            return 0;
        }
        int n=s.length();
        char []c=s.toCharArray();
        for(int i=2;i<n;i++)
        {
        
            if(c[i-2]!=c[i-1]&&c[i-1]!=c[i]&&c[i]!=c[i-2])
            {
                res++;
            }
        }
       
        return res;
    }
}