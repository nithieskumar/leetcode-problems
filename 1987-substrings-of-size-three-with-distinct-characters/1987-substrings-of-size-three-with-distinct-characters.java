class Solution {
    public int countGoodSubstrings(String s) {
        int n = s.length(), cnt = 0;
        for (int i = 0; i < n - 2; ++i){
            //Find a Substring of length 3
            String substring = s.substring(i, i + 3);
            //Create a HashSet for charachters storage
            HashSet<Character> charSet = new HashSet<>();
            boolean isUnique = true;
            for (char c : substring.toCharArray()) {
                // Try to add the character to the set
                if (!charSet.add(c)) {
                    isUnique = false; // If add returns false, it's a duplicate
                    break; // No need to check further
                }
            }

            if (isUnique) {
                cnt++; // It's a good substring
            }
        }
        return cnt;
    }
}