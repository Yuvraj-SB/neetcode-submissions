class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int[] rightmax = new int[heights.length];
        int[] leftmax = new int[heights.length];

        leftmax[0] = 0;
        rightmax[heights.length - 1] = 0;

        for(int i = 1; i < heights.length; i++){
            int leftcount = 0;
            int j = i;

            while(j - 1 >= 0 && heights[j - 1] >= heights[i]){
                leftcount++;
                j--;
            }

            leftmax[i] = leftcount;
        }

        for(int i = heights.length - 2; i >= 0; i--){
            int rightcount = 0;
            int k = i;

            while(k + 1 < heights.length && heights[k + 1] >= heights[i]){
                rightcount++;
                k++;
            }

            rightmax[i] = rightcount;
        }

        int max = 0;

        for(int i = 0; i < heights.length; i++){
            max = Math.max((leftmax[i] + rightmax[i] + 1) * heights[i], max);
        }

        return max;
    }
}