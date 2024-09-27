class Solution {
    public int countBinarySubstrings(String s) {
        int n=s.length();
        List<Integer> l=new ArrayList<>();
        int c=1;
        for(int i=1;i<n;i++)
        {
            if(s.charAt(i-1)==s.charAt(i))
            {
                c++;
            }
            else{
                l.add(c);
                c=1;
            }
        }
        l.add(c);
        int r=0;
        for(int i=0;i<l.size();i++)
        {
            System.out.print(l.get(i)+" ");
        }
        for(int i=1;i<l.size();i++)
        {
            r+=Math.min(l.get(i-1),l.get(i));
        }
        return r;
    }
}