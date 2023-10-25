class Solution {
   
   public int find(int arr[],int cap){
       int days=1,load=0;

       for(int i=0;i<arr.length;i++){
           if(arr[i]+load>cap){
               days=days+1; 
               load=arr[i]; 
           }else{
               load=load+arr[i]; 
           }
       }
       return days;
   }
   
   
    public int shipWithinDays(int[] weights, int days) {
        
        int max=Integer.MIN_VALUE;
        for(int x:weights){
            if(x>max){
                max=x;
            }
        }

        int sum=0;
        int sumofAllelements=0;
        for(int i=0;i<weights.length;i++){
            sumofAllelements+=weights[i];
        }
        int low=max;
        int high=sumofAllelements;

        System.out.print(low+" "+high);
        while(low<=high){
            int mid=low+(high-low)/2;
            int daysrequired=find(weights,mid); 
            if(daysrequired<=days){
             high=mid-1;
            }else{ 
                low=mid+1;
            }
        }

        return low; 

        


    }
}
