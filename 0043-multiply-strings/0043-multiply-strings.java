import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger n1=new BigInteger(num1);
        BigInteger n2=new BigInteger(num2);
        if(num1.equals("0")||num2.equals("0"))
        {
            return "0";
        }
        BigInteger mul=n1.multiply(n2);
        String s=mul.toString();
        return s;
        
    }
}