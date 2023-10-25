class Solution {
    public int findDuplicate(int[] arr) 
{
       int i = 0;
        while (i < arr.length) 
    {
       int correctpos = arr[i] - 1;
       if(arr[i] != i+1){
            if (arr[correctpos] != arr[i]){
                int temp = arr[i];
                arr[i] = arr[correctpos];
                arr[correctpos] = temp;
            } 
            else{
            return arr[i];
            }
        }   
        else{
                i++;
         }
    }
    return -1;    
 }
}
