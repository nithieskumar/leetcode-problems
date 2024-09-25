class Solution {
    public int firstUniqChar(String s) {
        int n=s.length();
        int[] s1=new int[26];
        char[] ch=s.toCharArray();
        for(char i:ch)
        {
            s1[i-'a']++;
        }
        for(int i=0;i<ch.length;i++)
        {
            if(s1[ch[i]-'a']==1)
            {
                return i;
            }
        }
        return -1;
    }
}