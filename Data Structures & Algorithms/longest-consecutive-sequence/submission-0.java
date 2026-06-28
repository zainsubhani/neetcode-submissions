class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int longest=0;
        for(int i=0;i<nums.length;i++)
        {
            int current=nums[i];
            int count=0;

            for(int j=i+1;j<nums.length;j++)
            {
                    if (nums[j] == current) {
    continue;
}
                if(current+1!=nums[j])
                {
                    break;
                   

                }
  

            count++;
            current=nums[j];

            }
            longest = Math.max(count+1,longest);

        }

        return longest;
        
    }
}
