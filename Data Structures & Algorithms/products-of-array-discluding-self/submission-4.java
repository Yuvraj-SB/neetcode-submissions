class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int product =1;
        int count =0;
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }
            else{
                product *= nums[i];
            }
        }
        if(count >= 1){
            int i=0;
            while(i<nums.length){
                if(nums[i]==0 & count ==1){
                    arr[i++]=product;
                }
                else{
                arr[i++]=0;
                }
            }
            return arr;
        }

        int j=0;
        while(j<nums.length){
            arr[j]=product/nums[j];
            j++;
        }
        return arr;
    }
}  
