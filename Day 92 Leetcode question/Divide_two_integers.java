class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend<-2147483647 && divisor==-1){
            return 2147483647;
        }
        return dividend/divisor;
    }
}
