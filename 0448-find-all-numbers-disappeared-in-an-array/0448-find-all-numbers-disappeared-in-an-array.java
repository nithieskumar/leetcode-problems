class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l=new ArrayList<>();
        boolean []a=new boolean[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            a[nums[i]-1]=true;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!a[i])
            {
                l.add(i+1);
            }
        }
        return l;
    }
}