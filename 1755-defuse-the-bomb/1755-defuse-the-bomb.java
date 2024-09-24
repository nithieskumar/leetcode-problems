class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] en=new int[code.length];
        int n=code.length;
        int m=0;
        if(k==0)
        {
            return en;
        }
            for(int i=0;i<n;i++)
            {
                int sum=0;
                if(k>0){
                for(int j=1;j<=k;j++)
                {
                    sum+=code[(i+j)%n];
                }
                en[i]=sum;
                }
                else{
                for(int j=1;j<=-k;j++)
                {
                    sum+=code[(i-j+n)%n];
                }
                en[i]=sum;

                }
            }
        
        return en;
        
    }
}