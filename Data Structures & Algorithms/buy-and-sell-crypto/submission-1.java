class Solution {
    public int maxProfit(int[] prices) {
        
        int[] suffix = new int[prices.length];
        suffix[prices.length-1] = prices[prices.length-1];

        for(int i = prices.length-2;i>=0;i--){
            suffix[i] = Math.max(prices[i],suffix[i+1]);
        }
        int sum =0;
        for(int i=0;i<prices.length-1;i++){
            sum = Math.max(suffix[i+1]-prices[i],sum);
        }
        return sum;
    }
}
