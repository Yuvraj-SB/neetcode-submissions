class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        
        heapq.heapify(nums)
        i=0
        n = len(nums)
        while i <= n-k:
            ans = heapq.heappop(nums)
            i+=1

        return ans    