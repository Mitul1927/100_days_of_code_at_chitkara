import java.util.*;

public class for_loop {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        int a= src.nextInt();
        int sum=0;
        for(int i=a;i>0;i--){
            sum+=i;
        }
        System.out.println(sum);
    }
}
