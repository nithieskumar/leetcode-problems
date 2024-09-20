class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
            if(c>='A'&&c<='Z'||c>='a'&&c<='z'||c>='0'&&c<='9')
            {
                s1.append(Character.toLowerCase(c));
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            char c=s.charAt(i);
            if(c>='A'&&c<='Z'||c>='a'&&c<='z'||c>='0'&&c<='9')
            {
                s2.append(Character.toLowerCase(c));
            }
        }
        return s1.toString().equals(s2.toString());
    }
}