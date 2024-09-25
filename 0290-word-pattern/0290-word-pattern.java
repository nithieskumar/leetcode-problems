class Solution {
    public boolean wordPattern(String pattern, String s) {
        String []a=s.split(" ");
        Map<Character,String> mp=new HashMap<>();
        if(pattern.length()!=a.length)
        {
            return false;
        }
        for(int i=0;i<pattern.length();i++)
        {
            char  ch=pattern.charAt(i); 
            if(mp.containsKey(ch)&&!mp.get(ch).equals(a[i]))
            {
                return false;
            }
            if(mp.containsValue(a[i])&&!mp.containsKey(ch))
            {
                return false;
            }
            else{
                mp.put(ch,a[i]);
            }
        }
        return true;
    }
}