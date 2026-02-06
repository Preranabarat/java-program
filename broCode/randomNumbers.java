package broCode;
import java.util.Random;
public class randomNumbers {
    public static void main(String[] args) {
        Random r=new Random();
        int  number1=r.nextInt(1,9);
        int  number2=r.nextInt(1,9);
        int  number3=r.nextInt(1,9);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        boolean isHeads;
        isHeads=r.nextBoolean();
        if(isHeads){
            System.out.println("HEADS");
        }
        System.out.println("TAILS");
        
    }
    
}
