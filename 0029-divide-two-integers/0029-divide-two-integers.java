class Solution {
    public int divide(int a, int b) {
        if(Integer.MIN_VALUE==a&&b==-1)
        {
            return Integer.MAX_VALUE;
        }
        boolean n=(a<0)^(b<0);
        long a1=Math.abs((long)a);
        long b1=Math.abs((long)b);
        int c=0;
        while(a1>=b1)
        {
            long t=b1,mul=1;
            while(a1>=(t<<1))
            {
                t<<=1;
                mul<<=1;
            }
            a1-=t;
            c+=mul;
        }
        if(n)
        {
            c=-c;
        }
        return c;
    }
}