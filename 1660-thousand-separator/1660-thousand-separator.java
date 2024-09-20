class Solution {
    public String thousandSeparator(int n) {
        StringBuilder s=new StringBuilder();
        if(n==0)
        {
            return "0";
        }
        int c=0;
        while(n!=0)
        {
            s.append(n%10);
            c++;
            n=n/10;
            if(c==3&&n!=0)
            {
                s.append(".");
                c=0;
            }
        }
        return s.reverse().toString();
    }
}