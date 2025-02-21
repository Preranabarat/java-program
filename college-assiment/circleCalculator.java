
import java.util.Scanner;

public class circleCalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the radius of the circle:");
        double radius = sc.nextDouble();
        double area =Math.PI*radius*radius;
        double perimeter= 2*Math.PI*radius;
        System.out.println("area of the circle"+area);
        System.out.println("perimiter of the circle"+perimeter);  

        sc.close();
    }
}
