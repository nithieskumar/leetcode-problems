class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int c=0;
        for(int i=0;i<nums.size();i++)
        {
            int r=nums.get(i);
            for(int j=i+1;j<nums.size();j++)
            {
                if((r+nums.get(j))<target)
                {
                    c++;
                }
            }
        }
        return c;
    }
}