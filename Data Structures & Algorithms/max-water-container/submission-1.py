class Solution:
    def maxArea(self, heights: List[int]) -> int:
        
        n = len(heights)-1
        i,j=0,n
        maxArea =0
        while i<j :
            maxArea = max(min(heights[i],heights[j])*(j-i),maxArea)
            if heights[i]<heights[j]:
                i+=1
            else:
                j-=1
        return maxArea            