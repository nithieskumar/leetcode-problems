class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int n1=jewels.length();
        int c=0;
        int n2=stones.length();
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                if(jewels.charAt(i)==stones.charAt(j))
                {
                    c++;
                }
            }
        }
        return c;
    }
}