class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int product =1;
        int count0 =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                count0 ++;
            }
            else{
            product *= nums[i];
            }
        }
        int[] res = new int[nums.length];
        if(count0 ==0){
            for(int i=0;i<nums.length;i++){
            res[i] = product / nums[i];
            }
        }
        else if(count0 == 1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    res[i] = product;
                }
                else{
                    res[i]=0;
                    }
            }
        }
        else{
            for(int i=0;i<nums.length;i++){
                res[i]=0;
            }
        }
        return res;
    }
}  
