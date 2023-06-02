import java.util.*;

public class reverse_array {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("Enter number of elements in the array : ");
        int a=src.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            System.out.println("element "+(i+1));
            arr[i]=src.nextInt();
        }
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }

}
