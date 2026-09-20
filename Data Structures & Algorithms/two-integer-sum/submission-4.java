class Solution {
    public int[] twoSum(int[] nums, int target) {
     Map<Integer,Integer> integers = new HashMap<>();
     for(int i=0;i<nums.length;i++){
        integers.put(nums[i],i);
     }   
     for(int i=0;i<nums.length;i++){
        int diff = target -nums[i];
        if (integers.containsKey(diff)  &&  integers.get(diff) != i ){
            return new int[]{i,integers.get(diff)};
        }
     }
    return new int[0];
    }
}
