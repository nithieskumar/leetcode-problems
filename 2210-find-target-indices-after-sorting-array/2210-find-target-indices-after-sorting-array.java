class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> l=new ArrayList<>();
        int n=nums.length;
        int a=0,b=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]<target)
            {
                a++;
            }
            else if(nums[i]==target)
            {
                b++;
            }
        }
        for(int i=0;i<b;i++)
        {
        
                l.add(i+a);
        }
        return l;
    }
}