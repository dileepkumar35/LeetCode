class Solution {
    public int maxProfit(int[] prices) {
        int hold = -Integer.MAX_VALUE, notHold = 0;
        for (int stockPrice : prices) {
            int prevHold = hold, prevNotHold = notHold;
            hold = Math.max(prevHold, prevNotHold - stockPrice);
            notHold = Math.max(prevNotHold, prevHold + stockPrice);
        }
        return notHold;
    }
}