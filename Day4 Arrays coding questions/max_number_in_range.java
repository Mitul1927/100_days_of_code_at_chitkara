import java.util.*;
import java.util.ArrayList;

public class max_number_in_range {
    public static void main(String[] args) {
        Scanner src=new  Scanner(System.in);
        System.out.print("enter the number of elements in array : ");
        int a= src.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            System.out.println("Element " + (i+1)+":");
            arr[i]=src.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter start range");
        int start = src.nextInt();
        System.out.println("Enter end range");
        int end= src.nextInt();
        int max= max_int(arr,start,end);
        System.out.println(max);
    }
    static int max_int(int[] arr,int start,int end){
        if(arr==null){
            return -1;
        }
        if(start>end){
            return -1;
        }
        int max2=arr[start];
        for(int i=start; i<=end;i++){
            if(max2<=arr[i]){
                max2=arr[i];
            }
        }
        return max2;
    }

}
