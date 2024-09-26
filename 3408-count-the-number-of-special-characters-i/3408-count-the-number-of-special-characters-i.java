class Solution {
    public int numberOfSpecialChars(String word) {
       int[]l=new int[26]; 
       int[]u=new int[26];
       int c=0;
       for(int i=0;i<word.length();i++)
       {
        char ch=word.charAt(i);
        if(ch>='a'&&ch<='z')
        {
            l[ch-'a']++;
        }
        else{
            u[ch-'A']++;
        }
       } 
       for(int i=0;i<26;i++)
       {
         if(l[i]>0&&u[i]>0)
         {
            c++;
         }
       }
       return c;
    }
}