class Solution {
    public String largestNumber(int[] nums) {
        int n=nums.length;
        String [] a=new String[n];
        StringBuilder s=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            a[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(a,(x,y) -> {
            String a1=x+y;
            String b1=y+x;
            for(int i=0;i<a1.length();i++)
            {
                if(a1.charAt(i)!=b1.charAt(i))
                {
                    return b1.charAt(i)-a1.charAt(i);
                }
            }
            return 0;
        });
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