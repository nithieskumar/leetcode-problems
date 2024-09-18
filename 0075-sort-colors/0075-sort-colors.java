class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int l=0;
        int m=0;
        int h=n-1;
        while(m<=h){
        if(nums[m]==0)
        {
            int temp1=nums[m];
            nums[m]=nums[l];
            nums[l]=temp1;
            l++;
            m++;
        }
        else if(nums[m]==1)
        {
            m++;
        }
        else{
            int temp2=nums[m];
            nums[m]=nums[h];
            nums[h]=temp2;
            h--;
        }
        }



    }
}