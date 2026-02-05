package broCode_javaFullCource;
import java.util.Scanner;

public class area_ractangle { 
    public static void main(String[] args) {

        double width = 0;
        double heigth = 0;
        double area = 0;
    
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your width:");
        width=sc.nextDouble();

        System.out.println("enter your heigth:");
        heigth=sc.nextDouble();

        area = width * heigth;

        System.out.println(" The area is :"+area);

        sc.close();
    }
}
