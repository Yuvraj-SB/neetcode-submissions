class Solution {
    public int maxNumberOfBalloons(String text) {
        
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : text.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int min = Integer.MAX_VALUE;
        for(char ch : map.keySet()){
            if(!map.containsKey('b') || !map.containsKey('a') ||
            !map.containsKey('l') || !map.containsKey('o') ||
            !map.containsKey('n')){
            return 0;
            }
            int freq =0;
            if(ch == 'l' || ch == 'o'){
                freq = map.get(ch)/2;
                min = Math.min(freq,min);
            }
            else if(ch == 'b' || ch == 'a' || ch == 'n' ){
                min = Math.min(map.get(ch),min);
            }
            else{
                continue;
            }
        }
        return min==Integer.MAX_VALUE ? 0 : min;
    }
}