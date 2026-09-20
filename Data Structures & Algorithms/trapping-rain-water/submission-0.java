class Solution {
    public int trap(int[] height) {
        
        int left =0;
        int right = height.length-1;
        int sum =0;
        int leftmax = height[left];
        int rightmax = height[right];
        while(left<right){
            if(leftmax < rightmax){
                left++;
                leftmax = Math.max(height[left],leftmax);
                sum += leftmax - height[left];
            }
            else{
                right--;
                rightmax = Math.max(height[right],rightmax);
                sum += rightmax - height[right];
            }
        }
        return sum;
    }
}
