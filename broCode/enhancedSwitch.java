package broCode;
import java.util.Scanner;
public class enhancedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day: ");
        String day;
        day = sc.nextLine();
        switch (day) {
            case "Monday":
                System.out.println("it is a weekday:");
                break;
                 case "Tuesday":
                System.out.println("it is a weekday:");
                break;
                 case "Wednesday":
                System.out.println("it is a weekday:");
                break;
                 case "Thursday":
                System.out.println("it is a weekday:");
                break;
                 case "Friday":
                System.out.println("it is a weekday:");
                break;
                 case "Saturday":
                System.out.println("it is a weekend:");
                break;
                 case "Sunday":
                System.out.println("it is a weekend:");
                break;

            default:
                System.out.println(day +" is not a day");
                break;
        }

        sc.close();
    }
}
