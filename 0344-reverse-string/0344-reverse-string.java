class Solution {
    public void reverseString(char[] s) {
        int n1=0;
        int n=s.length-1;
        while(n1<n)
        {
            char temp=s[n1];
            s[n1]=s[n];
            s[n]=temp;
            n1++;
            n--;
        }
    }
}