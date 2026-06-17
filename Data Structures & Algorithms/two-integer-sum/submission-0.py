from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        index_map = {}
        
        for index, value in enumerate(nums):
            complement = target - value
            if complement in index_map:
                return [index_map[complement], index]
            index_map[value] = index
