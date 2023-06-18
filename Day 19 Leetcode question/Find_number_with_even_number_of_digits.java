public class Find_number_with_even_number_of_digits {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int digit=0;
            int rem=0;
            while(nums[i]>0){
                digit++;
                nums[i]/=10;
            }
            if(digit%2==0){
                count++;
            }
        }
        return count;
    }
}
