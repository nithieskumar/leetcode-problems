class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1=new Stack<>();
        Stack<Character> s2=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            if(!s1.isEmpty()&&c1=='#')
            {
                s1.pop();
            }
            else{
                if(c1!='#'){
                s1.push(c1);
                }
            }
        }
        for(int i=0;i<t.length();i++){
            char c2=t.charAt(i);
            if(!s2.isEmpty()&&c2=='#')
            {
                s2.pop();
            }
            else{
                if(c2!='#'){
                s2.push(c2);
                }
            }
        }
        return s1.equals(s2);
    }
}