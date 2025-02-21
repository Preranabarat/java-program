import java.util.Scanner;

public class kilomiter_miles {
    public static void main(String[] args) {
        double kilomiters;
        System.out.println("enter kilomoiters");
        Scanner sc = new Scanner(System.in);
        kilomiters = sc.nextDouble();
        double miles =kilomiters/1.6;
        System.out.println(miles+"miles");
        sc.close();
    }
}
