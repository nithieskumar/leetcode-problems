class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> s1=new ArrayList<>();
        int n=words.length;

        String s="";
        for(int i=0;i<n;i++)
        {
            char[]a=words[i].toCharArray();
            Arrays.sort(a);
            String d=String.valueOf(a);
            if(!d.equals(s))
            {
                s1.add(words[i]);
            }
            s=d;
        }
        return s1;
    }
}