class Solution(object):
    def threeSum(self, nums):
        ans = []
        nums.sort()
        for i, a in enumerate(nums):
            if i > 0 and a == nums[i-1]:
                continue

            left, right = i + 1, len(nums) - 1
            while left < right:
                threesum = a + nums[left] + nums[right]
                if threesum > 0:
                    right -= 1
                elif threesum < 0:
                    left += 1
                else:
                    ans.append([a, nums[left], nums[right]])
                    left += 1
                    while nums[left] == nums[left - 1] and left < right:
                        left += 1
        
        return ans