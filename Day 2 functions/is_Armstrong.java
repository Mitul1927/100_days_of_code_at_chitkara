import java.util.*;

public class is_Armstrong {
    public static void main(String[] args) {
        Scanner src= new Scanner(System.in);
        System.out.println("Enter the range for armstrong");
        int a=src.nextInt();
        System.out.println("Enter the end range for armstrong");
        int b=src.nextInt();
        for(int i=a;i<=b;i++){
            if (isArmstrong(i)){
                System.out.println(i+" ");
            }
        }
    }
    static boolean isArmstrong(int a){
        int org=a;
        int sum=0;
        while(a>0){
            int rem=a%10;
            sum=sum+rem*rem*rem;
            a/=10;
        }
      if(org==sum){
          return true;
      }
      return false;
    }
}
