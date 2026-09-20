class Solution {
    public int longestConsecutive(int[] nums) {
        
        int max=1;
        int count=1;
        if(nums.length<= 1){
            return nums.length;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]-nums[i]==1 || nums[i+1]==nums[i]){
                if(nums[i+1]-nums[i]==1){
                count++;
                }
                max=Math.max(max,count);
            }
            else{
               count =1;
            }
        }
      return max;
    }
}
