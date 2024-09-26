class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> l=new ArrayList<>();
       int[] inter=new int[1001];
       int k=0;
       for(int i:nums1)
       {
         inter[i]++;
       }
       for(int i:nums2)
       {
         if(inter[i]>0)
         {
            l.add(i);
            k++;
          inter[i]--;
          
         }
       }
        int []a=new int[k];
        for(int i=0;i<k;i++)
        {
            a[i]=l.get(i);
        }
        return a;
    }
}