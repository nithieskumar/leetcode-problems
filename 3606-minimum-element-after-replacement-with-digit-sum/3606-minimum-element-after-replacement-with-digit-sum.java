class Solution {
    public int minElement(int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            int k=nums[i];
            int sum=0;
            while(k>0)
            {
               int r=k%10;
               sum=sum+r;
               k=k/10;
            }
            nums[i]=sum;
            if(nums[i]<min)
            {
                min=nums[i];
            }
            
        }
        return min;

    }
}