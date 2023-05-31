import java.util.*;

public class change_value {
    public static void main(String[] args) {
        int[] arr=new int[10];
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the numbers of elements in array : ");
        int a=src.nextInt();
        for(int i=0 ;i<a;i++){
            System.out.println("Enter number " + (i+1) + ":");
            arr[i]=src.nextInt();
        }
        change(arr);
        for (int i =0 ;i<a;i++){
            System.out.println(arr[i]);
        }
    }
    static void change(int[] array){
        array[0]=99;
    }
}