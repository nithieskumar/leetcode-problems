class Solution {
    public int getLucky(String s, int k) {
        StringBuilder s1=new StringBuilder();
        int sum=0;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            int v=s.charAt(i)-'a'+1;
            s1.append(v);
        }
        String s2=s1.toString();
        for(int i=0;i<k;i++)
        {
            sum=0;
            for(int j=0;j<s2.length();j++){
            sum+=s2.charAt(j)-'0';
            }
            s2=Integer.toString(sum);
        }
        return sum;

    }
}