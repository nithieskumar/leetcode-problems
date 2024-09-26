class Solution {
    public int mostFrequentEven(int[] nums) {
       int n=nums.length;
       int a[]=new int[100001];
       for(int i=0;i<n;i++)
       {
        int x=0;
        if(nums[i]%2==0)
        {
           a[nums[i]]++;
        
        }
       
       }
       int max=0;
       int k=-1;
       for(int i=0;i<a.length;i++)
       {
         if(a[i]>max)
         {
            max=a[i];
            k=i;
         }
       }   
       return k;
    }
}