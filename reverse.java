import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        int a=src.nextInt();
        int rev=0;
        while(a>0){
            int rem=a%10;
            rev= rev*10+rem;
            a/=10;
        }
        System.out.println(rev);
    }
}
