class Solution {
    public int[] applyOperations(int[] nums) {
        int n=nums.length;
        int[] a=new int[n];
        int j=0;
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                nums[i]=nums[i]*2;
                nums[i+1]=0;
                if(nums[i]>0)
                {
                  a[j++]=nums[i];
                }
            }
            else{
                if(nums[i]>0){
                a[j++]=nums[i];
                }
            }

        }
        if(nums[n-1]>0){
            a[j++]=nums[n-1];
        }
        return a;
    }
}