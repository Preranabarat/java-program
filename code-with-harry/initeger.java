import java.util.Scanner;
public class initeger {
    public static void main(String[] args) {
        System.out.println("enter your number");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
        sc.close(); 
    }
    
}
