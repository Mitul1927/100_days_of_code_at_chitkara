public class How_many_numbers_are_greater_than_current_number {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    count++;
                }
            }
            ans[i]=count;
        }
        return ans;
    }
}
