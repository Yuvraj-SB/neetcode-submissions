class Solution {
    public int maxNumberOfBalloons(String text) {
        
         
        int[] res = new int[5];
        for(char ch : text.toCharArray()){
            if(ch == 'b') res[0]++;
            else if(ch == 'a') res[1]++;
            else if(ch == 'l') res[2]++;
            else if(ch == 'o') res[3]++;
            else if(ch == 'n') res[4]++;
            else continue;
        }
        res[2] /= 2;
        res[3] /= 2;
        Arrays.sort(res);
        return res[0];
    }
}