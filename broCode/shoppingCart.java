package broCode;
import java.util.Scanner;
public class shoppingCart {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String item;
        double price;
        int quantity;
        char currency ='$';
        double total;

        System.out.println("what item would you like to buy ?:");
        item= sc.nextLine();

        System.out.println("what is the price for each?:");
        price=sc.nextDouble();

        System.out.println("how many would you like?:");
        quantity=sc.nextInt();

        total=price*quantity;

        System.out.println("you have bought"+quantity+" "+item+"/s");

        System.out.println("your total price is"+currency+total);

        sc.close();
    }
    
}
