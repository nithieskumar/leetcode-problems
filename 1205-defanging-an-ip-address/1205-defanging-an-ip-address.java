class Solution {
    public String defangIPaddr(String address) {
        int n=address.length();
        StringBuilder s=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            char c=address.charAt(i);
            if(c=='.')
            {
                s.append("[.]");
            }
            else{
                s.append(c);
            }
        }
        return s.toString();
    }
}