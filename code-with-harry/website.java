import java.util.Scanner;
public class website {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String website=sc.next();
        if(website.endsWith(".org")){
            System.out.println("this is organzation website");
        }
        else if(website.endsWith(".com")){
            System.out.println("this is commercial website");
        }
        else if(website.endsWith(".in")){
            System.out.println("this is indian website");
        }
        sc.close();
    
    }
    
}
