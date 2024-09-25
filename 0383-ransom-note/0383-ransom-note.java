class Solution {
    public boolean canConstruct(String r, String m) {
    int n1=r.length();
    int n2=m.length();
    int [] c=new int[26];
    for(int i=0;i<n2;i++)
    {
        c[m.charAt(i)-'a']++;
    }
    for(int j=0;j<n1;j++)
    {
        if(c[r.charAt(j)-'a']==0)
        {
            return false;
        }
        c[r.charAt(j)-'a']--;
    }
    return true;
    }
}