class Solution {
    public int subtractProductAndSum(int n) {
        int mul=1,sum=0;
        while(n>0)
        {
            int r=n%10;
            mul*=r;
            sum+=r;
            n=n/10;
        }
        int diff=mul-sum;
        return diff;

    }
}