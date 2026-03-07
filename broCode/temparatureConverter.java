package broCode;
import java.util.Scanner;
public class temparatureConverter {
    public static void main(String[] args) {
        // celcius to farenheight
        // farenheight to celcius
        Scanner sc =new Scanner(System.in);
        double temp;
        double newTemp;
        String unit;

        System.out.println("enter the temperature:");
        temp =sc.nextDouble();

        System.out.println("convert to celsius to fahrenheite?(c or f): ");
        unit = sc.next().toUpperCase();

        // System.out.println(temp);
        // System.out.println(unit);

        newTemp=(unit.equals("C")) ? (temp - 32) * 5 /9 : (temp * 5 / 9) + 32;
        System.out.println(newTemp + " degree " + unit);
        sc.close();
    }
}
