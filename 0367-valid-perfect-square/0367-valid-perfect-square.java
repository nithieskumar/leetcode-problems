class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<1)
        {
            return false;
        }
        long l=1;
        long h=num;
        while(l<=h)
        {
            long mid=l+(h-l)/2;
            long i=mid*mid;
           if(i==num)
           {
             return true;
           } 
           else if(i<num)
           {
            l=mid+1;
           }
           else{
            h=mid-1;
           }
        }
        return false;
    }
}