class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> seen = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            int remainder = target-nums[i];
            if(seen.containsKey(remainder))
            {
                return new int [] {seen.get(remainder),i};



            }
            seen.put(nums[i],i);
        }
        return new int [] {-1,-1};
        
    }
}
