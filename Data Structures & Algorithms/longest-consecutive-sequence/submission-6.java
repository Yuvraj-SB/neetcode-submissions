class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set= new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        int max =0;

          for (int num : set) {
            if (!set.contains(num - 1)) {
                int curr =1;
                int j =num+1;
                while(!set.isEmpty() && set.contains(j)){
                    curr++;
                    j++;
                }
                max = Math.max(curr,max);
            }
        }
        return max;
    }
}
