class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left=0;
        int right=arr.length-1;
        int n=arr.length;
        while(left<=right){
            int mid=(left+right)/2;
            if((mid==0 || arr[mid-1]<arr[mid]) && (mid==n-1 || arr[mid+1]<arr[mid])){
                return mid;
            }
            else if(mid>0 && arr[mid-1] >arr[mid]){
                right=mid-1;
            }
                else{
                    left=mid+1;
            }
        }
        return -1;
    }
}
