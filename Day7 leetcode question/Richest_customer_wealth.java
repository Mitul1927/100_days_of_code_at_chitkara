public class Richest_customer_wealth {
    public int maximumWealth(int[][] accounts) {
        int richest = 0;
        int totalWealth = 0;

        for (int[] account:accounts){
            for (int wealth:account){;
                totalWealth += wealth;
                richest = Math.max(richest, totalWealth);
            }
            totalWealth=0;
        }
        return richest;
    }
}
