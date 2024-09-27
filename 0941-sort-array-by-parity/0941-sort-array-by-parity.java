class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] a=new int[nums.length];
        List<Integer> l=new ArrayList<>();
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                a[j++]=nums[i];
            }
            else{
                 l.add(nums[i]);
            }
        }
        for(int i=0;i<l.size();i++)
        {
            a[j++]=l.get(i);
        }
        return a;
    }
}