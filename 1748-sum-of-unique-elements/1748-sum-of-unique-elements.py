class Solution:
    def sumOfUnique(self, nums: List[int]) -> int:
        
            seen = {}
            for num in nums:
                if num not in seen:
                    seen[num] = 1
                else:
                    seen[num] += 1
            result = 0
            for key, value in seen.items():
                if value == 1:
                    result += key
            return result
