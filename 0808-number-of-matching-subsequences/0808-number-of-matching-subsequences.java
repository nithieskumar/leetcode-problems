class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int c=0;
        char[] c1=s.toCharArray();
        for(int i=0;i<words.length;i++)
        {
            char[] w=words[i].toCharArray();
            int a=0;
            int b=0;
            while(a<w.length&&b<c1.length)
            {
                if(w[a]==c1[b])
                {
                    a++;
                    b++;
                }
                else{

                b++;
                    }
            }
            if(a==w.length)
            {
                c++;
            }
        }
        return c;
    }
}