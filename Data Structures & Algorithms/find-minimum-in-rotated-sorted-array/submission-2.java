class Solution {
    public int findMin(int[] nums) {
        
        int end =-1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
            end = i;
            break;
            }
        }
          if(end == -1){
            return nums[0];
        }

            reverse(nums,0,end);
            reverse(nums,end+1,nums.length-1);
            return nums[nums.length-1];
    }
    
    
    public void reverse(int[] nums, int start, int end){

        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] =temp;
            start++;
            end--;
        }
        return;
    }
}