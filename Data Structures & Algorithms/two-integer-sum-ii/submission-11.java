class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] and = new int[2];
        int left = 0;
        int right = nums.length-1;

        while(left<right){
            if(nums[left] + nums[right]  == target){
                and[0] = left+1;
                and[1] = right+1;
                return and;
            }
            else if(nums[left] + nums[right]  < target){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[]{-1,-1};
    }
}
