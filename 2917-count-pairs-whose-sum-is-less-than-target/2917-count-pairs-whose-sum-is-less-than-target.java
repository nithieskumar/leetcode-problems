class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int c=0;
        int n=nums.size();
        for(int i=0;i<n;i++)
        {
            int r=nums.get(i);
            for(int j=i+1;j<n;j++)
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