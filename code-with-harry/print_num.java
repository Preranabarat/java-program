import java.util.Scanner;

public class print_num {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Entetr the name ");
        String name=sc.nextLine();
        System.out.println("Hello "+name+" , how are you ?");
        sc.close();

    }
}
