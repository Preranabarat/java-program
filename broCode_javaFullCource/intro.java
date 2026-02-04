package broCode_javaFullCource;

import java.util.Scanner;

public class intro {
    public static void main(String args[]){
        System.out.println("Hello world !");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name : ");

        String name = scanner.nextLine();
        System.out.print("Enter your roll number : ");

        int roll = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your section : ");
        String sec = scanner.nextLine();

        System.out.println("Hello My name is :" + name);
        System.out.println("My roll no is :" + roll);
        System.out.println("My section is : " + sec);
        scanner.close();
    
    }
    
}
