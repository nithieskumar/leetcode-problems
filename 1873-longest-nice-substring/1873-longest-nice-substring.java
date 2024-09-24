class Solution {
    private boolean isnice(String s)
    {
        for(char i:s.toCharArray())
        {
            if(Character.isLowerCase(i))
            {
                if(!s.contains(Character.toString(Character.toUpperCase(i))))
                {
                    return false;
                }
            }
            else{
                if(!s.contains(Character.toString(Character.toLowerCase(i))))
                {
                    return false;
                }
                
            }

        }
            return true;
    }
    public String longestNiceSubstring(String s) {
        int n=s.length();
        String s1="";
        int n1=s.length();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                String s2=s.substring(i,j);
                if(isnice(s2))
                {
                    if(s2.length()>s1.length())
                    {
                        s1=s2;
                    }
                }
            }
        }
                return s1;

    }
}