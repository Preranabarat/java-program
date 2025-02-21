import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int fac=1;
        System.out.println("Enter the number");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            fac=fac*i;
        }

        System.out.println("Factorial value of "+num+" is "+fac);
        sc.close();
    }
}