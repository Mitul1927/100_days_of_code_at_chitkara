class Solution {
    public int specialArray(int[] nums) {
        for(int i=0;i<nums.length+1;i++){
            int k=0;
            for(int j=0;j<nums.length;j++){
                if(i<=nums[j]){
                    k++;
                }
            }
            if(k==i){
                return i;
            }
        }
        return -1;
        }
    }
