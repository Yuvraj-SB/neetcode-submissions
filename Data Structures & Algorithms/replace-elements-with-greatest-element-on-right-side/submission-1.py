class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:

        n = len(arr)
        arr1 = [-1] * n
        rmax = arr[n-1];

        for i in range(n-2,-1,-1):
            arr1[i] = rmax
            rmax = max(arr[i],rmax)


        return arr1