class Solution {    
    HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
    public Solution(int[] nums) {
       for(int i=0;i<nums.length;i++)
       {
         ArrayList<Integer> l=map.getOrDefault(nums[i],new ArrayList<>());
         map.put(nums[i],l);
         l.add(i);
       }
    }
    public int pick(int target)
    {
        ArrayList<Integer> list=map.get(target);
        int k=(int)(Math.random()*list.size());
        return list.get(k);
    }
    
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */