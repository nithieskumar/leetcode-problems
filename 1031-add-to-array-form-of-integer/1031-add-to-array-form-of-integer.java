class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int n=num.length;
        int c=k;
        List<Integer> m=new ArrayList();
        for(int i=n-1;i>=0||c>0;i--)
        {
            if(i>=0)
            {
                c+=num[i];
            }
            m.add(c%10);
            c/=10;
        }
        Collections.reverse(m);
        return m;

    }
}
