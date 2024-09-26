class Solution {
    public int longestPalindrome(String s) {
        int []c=new int[60];
        char[]a=s.toCharArray();
        int l=0;
        for(int i=0;i<s.length();i++)
        {
            c[a[i]-'A']++;
        }
        for(int i=0;i<c.length;i++)
        {
            l+=(2*(c[i]/2));
        }
        return l<s.length()?l+1:l;
    }
}