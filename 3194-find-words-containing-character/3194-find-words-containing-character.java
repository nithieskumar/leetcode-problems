class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> l=new ArrayList<>();
        int k=0;
        int c=0;
        for(int i=0;i<words.length;i++)
        {
            c=0;
            for(int j=0;j<words[i].length();j++)
            {
                if(words[i].charAt(j)==x)
                {
                    c++;
                }
            }
            if(c>=1)
            {
                l.add(i);
            }

        }
        return l; 
    }
}