class Solution {
    public int mostFrequentEven(int[] nums) {
       int n=nums.length;
       int a[]=new int[100001];
       int k=1;
       for(int i=0;i<n;i++)
       {
        if(nums[i]%2==0)
        {
           a[nums[i]]++;
           if(a[k]<a[nums[i]]||(a[k]==a[nums[i]]&&k>nums[i]))
           {
            k=nums[i];
           }
        
        }
       
       }
      
       return k==1?-1:k;
    }
}