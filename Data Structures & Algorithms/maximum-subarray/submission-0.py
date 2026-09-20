class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        
        maxsum = nums[0]
        curr =0
        i=0
        while i<len(nums):
            if curr < 0:
                curr =0
            curr += nums[i]
            maxsum = max(curr,maxsum)
            i+=1
        return maxsum        