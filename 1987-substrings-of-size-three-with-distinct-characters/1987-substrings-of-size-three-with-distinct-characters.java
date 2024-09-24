class Solution {
    public int countGoodSubstrings(String s) {
        int res=0;
        if(s.length()<3)
        {
            return 0;
        }
        int n=s.length();
        for(int i=2;i<n;i++)
        {
        int a=s.charAt(i-2);
        int b=s.charAt(i-1);
        int c=s.charAt(i);
            if(a!=b&&b!=c&&c!=a)
            {
                res++;
            }
            else{
                a=b;
                b=c;
                c=s.charAt(i);
            }
        }
       
        return res;
    }
}