class Solution {
    public int[] distributeCandies(int n, int k) {
        int[] a=new int[k];
        int c=1,n1=0;
        while(n>0)
        {
           if(n1==k)
           {
            n1=0;
           }
           if(c>n)
           {
             c=n;
           }
           a[n1++]+=c;
           n-=c;
           c++;
        }
        return a;
    }
}

