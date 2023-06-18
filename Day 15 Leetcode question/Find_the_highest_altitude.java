public class Find_the_highest_altitude {
    public int largestAltitude(int[] gain) {
        int sum=0;
        int m=0;
        for(int i=0;i<gain.length;i++){
            sum = sum+gain[i];
            m=Integer.max(m,sum);
        }
        return m;
    }
}
