class Solution {
    public int missingNumber(int[] nums) {
       Arrays.sort(nums);
       int max=nums[nums.length-1];
        int r=0;
        for(int i=0;i<=max;i++)
        {
            if(nums[i]!=i)
            {
              r=i;
              break;
            }
            r=max+1;
        }
        return r;
    }
}