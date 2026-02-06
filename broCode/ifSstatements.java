package broCode;
import java.util.Scanner;
public class ifSstatements {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);



    System.out.println("Enter your name:");
    String name=sc.nextLine();
    if(name.isEmpty()){
        System.out.println("you didn't enter your name !");
    }
    else{
        System.out.println("Hello" + name + "!");
    }



        System.out.println("Enter your age:");
        int age=sc.nextInt();

        if(age>=18){
            System.out.println("you are adult!");
        }
        else if(age>=60){
            System.out.println("you are senior!");
        }
        else if(age<0){
            System.out.println("you haven't born yet!");
        }
        else{
            System.out.println("you are a child!");
        }


        System.out.println("Are you student enter only(true/false):");
        boolean isStudent=sc.nextBoolean();

        if(isStudent){
            System.out.println("you are a student:");
        }
        else{
            System.out.println("you are NOT a student");
        }
        
        

        sc.close();
    }
}
