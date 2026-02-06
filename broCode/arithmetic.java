package broCode;
import java.util.Scanner;
public class arithmetic {
    public static void main(String[] args) {
        int a;
        int b;
        double c;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a value of a:");
        a=sc.nextInt();
        System.out.println("emter a value of b:");
        b=sc.nextInt();
        // c = a + b;
        // c = a - b;
        // c = a * b;
        // c = a % b;
        c = a / b;
        System.out.println(c);

        double result = a+b *(a*b)/b;
        System.out.println("resul is =" +result);

        sc.close();

    
    }
    
}
