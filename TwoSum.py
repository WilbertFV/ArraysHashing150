from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        prevMap = {}  # val -> index

        for i, n in enumerate(nums):
            diff = target - n
            if diff in prevMap:
                return [prevMap[diff], i]
            prevMap[n] = i

def main():
    solution = Solution()
    nums = [2, 7, 11, 15]
    target = 9

    result = solution.twoSum(nums, target)

    print("Indices of the two numbers that add up to the target:", result)  # Output will be [0, 1]

if __name__ == "__main__":
    main()
