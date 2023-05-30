import java.util.Scanner;

public class case_check {
    public static void main(String[] args) {
        Scanner src= new Scanner(System.in);
        char ch=src.next().trim().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Uppercase");
        }
    }
}
