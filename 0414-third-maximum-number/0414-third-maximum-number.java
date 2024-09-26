class Solution {
    public int thirdMax(int[] nums) {
        Integer m1=null;
        Integer m2=null;
        Integer m3=null;
        for(Integer i:nums)
        {
            if(i.equals(m1)||i.equals(m2)||i.equals(m3))
            {
                continue;
            }
                if(m1==null||i>m1)
                {
                    m3=m2;
                    m2=m1;
                    m1=i;
                }
                else if(m2==null||i>m2)
                {
                    m3=m2;
                    m2=i;
                }
                else if(m3==null||i>m3){
                    m3=i;
                }
            }
        

        return m3==null ?m1:m3;
    }
}