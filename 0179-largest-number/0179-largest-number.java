class Solution {
    public String largestNumber(int[] nums) {
        int n=nums.length;
        String [] a=new String[n];
        StringBuilder s=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            a[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(a,(x,y) -> (y+x).compareTo(x+y));
        if(a[0].equals("0"))
        {
            return "0";
        }
        for(String s1: a)
        {
            s.append(s1);
        }
        return s.toString();
    }
}