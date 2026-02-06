package broCode;
import java.util.Scanner;
public class mathClass {
    public static void main(String[] args) {
    //    HYPOTHENUSE c=Math.sqrt(a2 +b2) 
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your lenght if side a");
    double a=sc.nextDouble();
    System.out.println("Enter the length of side b");
    double b=sc.nextDouble();

    double c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
    System.out.println("HYPOTHENUSE is ="+c);



    // CIRCUMFERENCE= 2*Math.PI*radius;
    //AREA=Math.PI*Math.pow(radius,2);
    //VOLUME=(4.0/3.0)*Math.PI*Math.pow(radius,3)
    System.out.println("enter the radius");
    double radius= sc.nextDouble();

    double circumferenc = 2*Math.PI*radius;

    double area =Math.PI*Math.pow(radius,2);;
    double volume=(4.0/3.0)*Math.PI*Math.pow(radius,3);
    System.out.printf("the circumference is :"+circumferenc+"cm");
    System.out.printf("the area is;"+area+"cmS");
    System.out.printf("the volume is;"+volume+"cmQ");







    sc.close();
    }
    
}
