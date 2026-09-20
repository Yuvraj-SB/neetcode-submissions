class Solution {
    public boolean isPalindrome(String s) {
         String ans = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start=0;
        int end=ans.length()-1;

        while(start<=end){
            if(ans.charAt(start)!=ans.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
