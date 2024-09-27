class Solution {
    public boolean func(int[] a,int m,int k)
    {
        int c=1;
        int l=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]-l>=k)
            {
                l=a[i];
                c++;
            }
            if(c>=m)
            {
                return true;
            }
        }
        return false;
    }
    public int maxDistance(int[] a, int m) {
        Arrays.sort(a);
        int n=a.length;
        int i=1;
        int j=a[a.length-1]-a[0];
        int r=0;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            if(func(a,m,mid))
            {
                r=mid;
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return r;
    }
} 