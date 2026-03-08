package broCode;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        double num1 = sc.nextDouble();

        System.out.println("Enter the second number :");
        double num2=sc.nextDouble();

        double result=0;

        System.out.println("Enter the operator(+, -, *, /, ^) ");
        char operator = sc.next().charAt(0);

        boolean  validOperator = true;

        switch(operator){
            case '+' -> result = num1 + num2 ;
            case '-' -> result = num1 - num2 ;
            case '*' -> result = num1 * num2 ;
            case '/' -> {
                if(num2 == 0){
                    System.out.println();
                    validOperator =false;
                }
                else{
                    result =num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2) ;

            default -> 
            {
                System.out.println( "invalid operator !");
                validOperator = false;
            }
        }
        if(validOperator){
            System.out.println("The result is = " + result);

        }
        
        
        sc.close();
    }
}
