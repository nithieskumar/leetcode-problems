class Solution {
    public int firstUniqChar(String s) {
        int n=s.length();
        int[] s1=new int[26];
        for(char i:s.toCharArray() )
        {
            s1[i-'a']++;
        }
        for(int i=0;i<s.length();i++)
        {
            if(s1[s.charAt(i)-'a']==1)
            {
                return i;
            }
        }
        return -1;
    }
}