class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> h1=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            h1.add(nums1[i]);
        }
        Set<Integer> h2=new HashSet<>();
    
        for(int i=0;i<nums2.length;i++)
        {
            if(h1.contains(nums2[i]))
            {
                h2.add(nums2[i]);
            }
        }
        int[]c=new int[h2.size()];
        int k=0;
        for(int i:h2)
        {
            c[k++]=i;
        }
      return c;
    }
}