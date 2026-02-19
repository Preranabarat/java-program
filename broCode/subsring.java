package broCode;
import java.util.Scanner;
public class subsring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        System.out.println("Enter yor email : ");
        String email=sc.nextLine();
        String username;
        String domain;

        if(email.contains("@")){
            username=email.substring(0,email.indexOf("@"));
            domain=email.substring(email.indexOf("@")+1);

            System.out.println(username);
            System.out.println(domain);
        }
        else{
            System.out.println("Email must contains @ ");
        }


        sc.close();
    }
    
}
