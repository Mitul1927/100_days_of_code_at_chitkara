import java.util.*;

public class while_loop {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        int a=src.nextInt();
        int sum=0;
        while(a>0){
            sum+=a;
            a-=1;
        }
        System.out.println(sum);
    }
}