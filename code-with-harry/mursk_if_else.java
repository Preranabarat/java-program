import java .util.Scanner;
public class mursk_if_else {
    public static void main(String[] args) {
         byte m1,m2,m3;
         Scanner sc=new Scanner(System.in);
         System.out.println("enter your math mursk");
         m1=sc.nextByte();
         System.out.println("enter your physic mursk");
         m2=sc.nextByte();
         System.out.println("enter your camestry mursk");
         m3=sc.nextByte();
         float avg=(m1+m2+m3)/3.0f;
         if(avg>40 && m1>33 && m2>33 && m3>33){
            System.out.println("you are passed");
         }
         else{
            System.out.println("you are failed");
         }
         sc.close();

         }
    }