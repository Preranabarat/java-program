import java.util.Scanner;
import java.util.Random;


public class stone_paper_scissor {
  public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter 0 for stone,1 for paper,2 for scissor");
    int userInput = Sc.nextInt();
    Random random = new Random();
    int computerInput = random.nextInt(3);
    if(userInput == computerInput){
        System.out.println("draw");
    }
    else if(userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1){
        System.out.println("you wine!");
    }
    else{
        System.out.println("computer win!");
    }
    System.out.println("computer choice:"+computerInput);
    Sc.close();
  }  

}
