class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        arr = [0] * len(nums)
        count =0
        product =1
        index=0
        for i in range(len(nums)):
            if nums[i]==0:
                count+=1
                index = i
            else:
                product*= nums[i]    
            if count >= 2:
                return arr

        if count == 1 :
            arr[index] = product
            return arr

        for j in range(len(nums)):
            arr[j] = product // nums[j]

        return arr        


