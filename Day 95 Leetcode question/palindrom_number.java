class Solution {
    public boolean isPalindrome(int x) {
        int y=x;
        int sum=0;
        if(x<0){
            return false;
        }
        while(x>0){
            int rem=x%10;
            sum=sum*10+rem;
            x/=10;
        }
        if(y==sum){
            return true;
        }
        else{
            return false;
        }
    }
}
