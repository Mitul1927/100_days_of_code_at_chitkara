import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.println("Enter the operator:  ");
            char operator = src.next().trim().charAt(0);
            if(operator == '+' || operator=='-' || operator=='*' || operator=='/' || operator=='%') {
                System.out.println("Enter two numbers: ");
                int a = src.nextInt();
                int b = src.nextInt();

                if (operator == '+') {
                    System.out.println(a + b);
                }
                if (operator == '-') {
                    System.out.println(a - b);
                }
                if (operator == '*') {
                    System.out.println(a * b);
                }
                if (operator == '/') {
                    System.out.println(a / b);
                }
                if (operator == '%') {
                    System.out.println(a % b);
                }
            }
            else if(operator=='x' || operator=='X'){
                break;
            }
            else{
                System.out.println("Invalid Operation!!");
            }
            System.out.println(ans);
        }
    }
}
