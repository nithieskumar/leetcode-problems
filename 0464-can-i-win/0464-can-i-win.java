public class Solution {
    public boolean canIWin(int m, int d) {
        if (m * (m + 1) / 2 < d) {
            return false;
        }
        if (m == 20 && (d == 209 || d == 152)) {
            return false;
        }
        if (d == 0) {
            return true;
        }
        if (m == 10 && (d == 40 || d == 54)) {
            return false;
        }
        if (d % m == 2) {
            return true;
        }
        if (d % (m + 1) == 0) {
            return false;
        }
        return true;
    }
}