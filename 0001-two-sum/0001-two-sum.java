class Solution {
    public int[] twoSum(int[] nums, int k) {
        int n = nums.length;
        for(int i = 1; i < n; i++){
            for(int j = i; j < n; j++){
                if(nums[j] + nums[j - i] == k){
                    return new int[]{j, j - i};
                }
            }
        }
        return new int[]{};
    }
}