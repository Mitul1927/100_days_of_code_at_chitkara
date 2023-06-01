import java.util.*;

public class inputArray {
    public static void main(String[] args) {
        Scanner src= new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int a= src.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            System.out.println("Element : " + (i+1));
            arr[i]=src.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
