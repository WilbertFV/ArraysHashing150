# question: https://leetcode.com/problems/contains-duplicate/

from typing import List

class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        hashset = set()

        for n in nums:
            if n in hashset:
                return True
            hashset.add(n)
        return False

# Test the method
solution = Solution()
nums = [1, 2, 3, 4, 2]
result = solution.containsDuplicate(nums)
print("Contains duplicate:", result)  # Output will be True