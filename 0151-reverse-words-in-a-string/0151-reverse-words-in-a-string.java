class Solution {
    public String reverseWords(String s) {
        StringBuilder s1=new StringBuilder();
        int n=s.length();
        int i=n-1;
        while(i>=0)
        {
            while(i>=0&&s.charAt(i)==' ')
            {
                i--;
            }
            int j=i;
            while(i>=0&&s.charAt(i)!=' ')
            {
                i--;
            }
            if(j>=0)
            {
                s1.append(s.substring(i+1,j+1)).append(' ');
            }
        }
        return s1.toString().trim();
    }
}