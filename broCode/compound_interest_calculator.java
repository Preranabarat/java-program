package broCode;
import java.util.Scanner;
public class compound_interest_calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int year;
        double amount;

        System.out.print("Enter the principal amount:");
        principal=sc.nextDouble();

        System.out.print("Enter the interest rate(in %):");
        rate=sc.nextDouble() /100;

        System.out.print("Enter the number of times compounded per year:");
        timesCompounded=sc.nextInt();

        System.out.print("Enter the number of years:");
        year=sc.nextInt();


        amount =principal * Math.pow(1 + rate / timesCompounded , timesCompounded * year);

        System.out.println("The amount after " + year + "is: $" + amount);

         

        sc.close();
    }
}
