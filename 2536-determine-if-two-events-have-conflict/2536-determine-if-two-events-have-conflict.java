class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        int j=event1[0].compareTo(event2[1]);
        int i=event1[1].compareTo(event2[0]);
        return (i>=0&&j<=0);
    }
}