class Solution {
    public int countSeniors(String[] details) {
        
        int count =0;
        for(String detail : details){
            int num = detail.charAt(11) - '0';
            int num2 = detail.charAt(12) - '0';
            if(num > 6  || (num == 6 && num2 > 0)){
                count++;
            }
        }
        return count;
    }
}