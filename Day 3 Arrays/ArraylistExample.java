import java.util.Scanner;
import java.util.ArrayList;

public class ArraylistExample {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
        for(int i =0;i<5;i++){
            list.add(src.nextInt());
        }
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));
        }
        list.remove(2);
        System.out.println(list);
    }
}