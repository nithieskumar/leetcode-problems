class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        List<Integer> l1=new ArrayList<>();
        int[] b=new int[1000];
        int n=nums.length;
        int j=0;
        for(int i=0;i<n;i++)
        {
            b[nums[i]]++;
        }
        for(int i=0;i<1000;i++)
        {
            if(b[i]==2)
            {
                l1.add(i);
            }
        }
        int[] a=new int[l1.size()];
         for(int i=0;i<l1.size();i++)
         {
            a[j++]=l1.get(i);
         }
        return a;
    }
}