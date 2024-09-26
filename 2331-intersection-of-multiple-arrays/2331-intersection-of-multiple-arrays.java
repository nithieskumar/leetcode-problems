class Solution {
    public List<Integer> intersection(int[][] nums) {
        int c[]=new int[1001];
         for(int j=0;j<nums[0].length;j++)
         {
                c[nums[0][j]]++;
         }
         for(int i=1;i<nums.length;i++)
         {
            boolean []a=new boolean[1001];
            for(int j=0;j<nums[i].length;j++)
            {
                if(c[nums[i][j]]==i)
                {
                    a[nums[i][j]]=true;
                }
            }
         
         for(int k=0;k<1001;k++)
         {
            if(a[k])
            {
                c[k]++;
            }
         }
         }
         List<Integer> l=new ArrayList<>();
         for(int i=0;i<1001;i++)
         {
            if(c[i]==nums.length)
            {
                l.add(i);
            }
         }
        return l;
    }
}