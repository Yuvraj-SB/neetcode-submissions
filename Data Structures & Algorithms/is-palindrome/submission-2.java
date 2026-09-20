class Solution {
    public boolean isPalindrome(String s) {
        
        String ss = s.trim();
        ss = ss.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start =0;
        int end =ss.length()-1;

        while(start < end){
            if(ss.charAt(start) != ss.charAt(end)){
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }
}
