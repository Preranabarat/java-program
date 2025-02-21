import java .util.Scanner;
public class else_if {
    public static void main(String[]args){
        int age=56;
        System.out.println("enter your age");
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
        if(age>56){
            System.out.println("you are experienced!");
        }
        else if(age>46){
            System.out.println("you are semi exprerienced!");
        }
        else if(age>36){
            System.out.println("you are semi exprerienced!");
        }
        else{
            System.out.println("you are not exprerienced!");
        }
    sc.close();
    }
    
}
