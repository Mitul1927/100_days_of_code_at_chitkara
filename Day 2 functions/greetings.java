import java.util.*;

public class greetings {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        String ch=src.nextLine();
        greet(ch);
    }
    static void greet(String ch){
        System.out.println("Hello " + ch);
    }
}
