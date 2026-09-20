class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:

        arr1 = [-1] * len(arr)
        max = arr[len(arr)-1];

        for i in range(len(arr)-2,-1,-1):
            arr1[i] = max
            if arr[i] > max:
                max = arr[i];


        return arr1