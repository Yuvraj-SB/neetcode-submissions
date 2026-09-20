class Solution {
    public int[] productExceptSelf(int[] nums) {
        int count = 0;
        int prod =1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
             prod = prod * nums[i];
            }
            else{
                count++;
            }
           
        }
        if(count>1){
            for(int i=0;i<nums.length;i++){
                nums[i]=0;
            }
        }
        else if(count==0){
            for(int i=0;i<nums.length;i++){
                nums[i]= prod/nums[i];
            }
        }
        else{
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    nums[i]=prod;
                }
                else{
                nums[i]=0;
                }
            }
        }
        return nums;
    }
}  
