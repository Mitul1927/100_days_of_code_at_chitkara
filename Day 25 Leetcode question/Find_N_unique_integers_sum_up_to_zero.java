public class Find_N_unique_integers_sum_up_to_zero {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        if(n%2==1){
            ans[n-1]=0;
            for(int i =0;i<n-1;i+=2){
                ans[i]=i+1;
                ans[i+1]=-(i+1);
            }
        }else{
            for(int i =0;i<n;i+=2){
                ans[i]=i+1;
                ans[i+1]=-(i+1);
            }
        }
        return ans;
    }
}
