class Solution {
    public int maxArea(int[] nums) {
        
        int maxarea =0;
        int start =0;
        int end =nums.length-1;
        while(start<end){
            maxarea = Math.max(Math.min(nums[start],nums[end]) * (end - start), maxarea);
             if (nums[start] < nums[end]) {
                start++;
            } else {
                end--;
            }
        }
        return maxarea;
    }
}
