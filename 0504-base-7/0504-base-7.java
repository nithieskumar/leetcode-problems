class Solution {
    public String convertToBase7(int num) {
        if(num==0)
        {
            return "0";
        }
      StringBuilder s=new StringBuilder();
      int num1=Math.abs(num);
      while(num1>0)
      {
        int r=num1%7;
        s.append((char)('0'+r));
        num1=num1/7;
      }
      if(num<0)
      {
        s.append('-');
      }
      return s.reverse().toString();
    }
}