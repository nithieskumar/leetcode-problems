class Solution {
    public int compress(char[] chars) {
        int k=0;
        int c=0;
        for(int i=0;i<chars.length;i++)
        {
            c++;
            if(i+1==chars.length||chars[i]!=chars[i+1])
            {
                 chars[k]=chars[i];
                 k++;
                 if(c!=1)
                 {
                    String s=Integer.toString(c);
                    for(char p:s.toCharArray())
                    {
                        chars[k]=p;
                        k++;
                    }
                 }
                 c=0;
            }

        }
        return k;
    }
}