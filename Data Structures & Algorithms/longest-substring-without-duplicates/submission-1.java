class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Set<Character> set = new HashSet<>();
        int max =0;
        int left =0;
        for(char c : s.toCharArray()){
            if(set.contains(c)){
                while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
                }
            }
            set.add(c);
            max = Math.max(set.size(),max);
        }
        return max;
    }
}
