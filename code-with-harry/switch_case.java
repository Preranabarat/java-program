import java.util.Scanner;
public class switch_case {
    public static void main(String[] args) {
        int age;
        System.out.println("enter your age");
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
        switch(age){
            case 18:
            System.out.println("you are adult");
            break;
            case 23:
            System.out.println("you are going to joind job");
            break;
            case 68:
            System.out.println("you are going to retired");
            break;
            default:
            System.out.println("enjoy your life");
        }
        sc.close();
    }
    
}
