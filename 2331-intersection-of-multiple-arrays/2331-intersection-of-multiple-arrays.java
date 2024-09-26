class Solution {
    public List<Integer> intersection(int[][] nums) {
        int c[]=new int[1001];
         List<Integer> l=new ArrayList<>();
         for(int[]a:nums)
         {
            for(int i:a)
            {
                c[i]++;
            }
         }
         for(int i=0;i<c.length;i++)
         {
            if(c[i]==nums.length)
            {
                l.add(i);
            }
         }
        return l;
    }
}