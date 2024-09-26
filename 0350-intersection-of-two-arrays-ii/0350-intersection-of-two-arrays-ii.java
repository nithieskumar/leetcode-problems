class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> inter=new ArrayList<>();
        boolean []v=new boolean[nums2.length];
        int k=0;
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j]&&!v[j])
                {
                    inter.add(nums1[i]);
                    v[j]=true;
                    k++;
                    break;
                }
            }
        }
        int []a=new int[k];
        for(int i=0;i<k;i++)
        {
            a[i]=inter.get(i);
        }
        return a;
    }
}