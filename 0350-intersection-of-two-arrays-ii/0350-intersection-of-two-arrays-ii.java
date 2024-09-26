class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] l=new int[nums2.length];
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
            l[k]=i;
            k++;
          inter[i]--;
          
         }
       }
        
        return Arrays.copyOfRange(l,0,k);
    }
}