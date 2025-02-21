import java.util.Scanner;
public class practice_set{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your math marks");
        int math = scan.nextInt();
        System.out.println("enter your science marks");
        int science=scan.nextInt();
        System.out.println("enter your physic marks");
        int physic=scan.nextInt();
        System.out.println("enter your biology marks");
        int biology=scan.nextInt();
        System.out.println("enter your computer marks");
        int computer=scan.nextInt();
        float persentage=((math+science+physic+biology+computer)/500.0f)*100;
        System.out.println("persentage:");
        System.out.println(persentage);
        scan.close();
    }
}