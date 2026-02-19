package broCode;
import java.util.Scanner;
public class weightConverter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double weight;
        double newWeight;
        int choice;
        System.out.println("weight conversion program !");

        System.out.println("1: convert lbs (pounds) :");
        System.out.println("2: convert kgs (kilogram) :");

        System.out.println("choice an option:");
        choice=sc.nextInt();

        if(choice == 1){
            System.out.println("Enter the wight in pounds:");
            weight=sc.nextDouble();
            newWeight=weight*0.453592;
            System.out.println("The new weight in kilogram is ="+newWeight);
        }
        else if(choice == 2){
            System.out.println("Enter the wight in kilogram:");
            weight=sc.nextDouble();
            newWeight=weight*2.20462;
            System.out.println("The new weight in pounds is ="+newWeight);
        }
        else{
            System.out.println("This is not a valid choice");
        }

        sc.close();

    }
    
}
