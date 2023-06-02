import java.util.*;
import java.util.Arrays;

public class Array_in_2d_input {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("enter the number of rows : ");
        int a= src.nextInt();
        System.out.println("enter the number of columns : ");
        int b= src.nextInt();
        int[][] arr= new int[5][5];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.println("Element ["+(i+1)+"]["+(j+1)+"]");
                arr[i][j]=src.nextInt();
            }
        }
      for(int i=0;i<a;i++){
          for(int j=0;j<b;j++){
              System.out.print(arr[i][j]);
          }
          System.out.println();
      }
    }
}
