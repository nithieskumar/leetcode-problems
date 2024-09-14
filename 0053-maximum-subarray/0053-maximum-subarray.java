class Solution {
    public int maxSubArray(int[] a) {
        int n=a.length;
       int s=0,e=0,max1=a[0],max2=a[0],temp=0;
		for(int i=1;i<n;i++)
		{
		    if(a[i]>max1+a[i])
		    {
		        max1=a[i];
		        temp=i;
		    }
		    else{
		        max1+=a[i];
		    }
		    if(max1>max2)
		    {
		        max2=max1;
		        s=temp;
		        e=i;
		    }
		}
        return max2;
    }
}