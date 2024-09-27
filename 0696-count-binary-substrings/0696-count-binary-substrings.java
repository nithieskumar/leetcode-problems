class Solution {
    public int countBinarySubstrings(String s) {
        int n=s.length();
        List<Integer> l=new ArrayList<>();
        int c=1,r=0,temp=0;
        for(int i=1;i<n;i++)
        {
            if(s.charAt(i-1)==s.charAt(i))
            {
                c++;
            }
            else{
                r+=Math.min(temp,c);
                temp=c;
                c=1;
            }
        }
        return r+Math.min(temp,c);
    }
}