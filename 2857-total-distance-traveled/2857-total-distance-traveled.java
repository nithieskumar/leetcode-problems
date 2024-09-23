class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int rem=0;
        while(mainTank>=5&&additionalTank>=1)
        {
            rem+=50;
            mainTank-=5;
            mainTank+=1;
            additionalTank--;
        }
        rem+=(10*mainTank);
        return rem;
    }
}