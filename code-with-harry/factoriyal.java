import java.util.Scanner;
public class factoriyal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int factoriyal=1;
        for(int i=1;i<=num;i++){
            factoriyal *=i;
        }
        System.out.println("factoriyal of"+num+"is"+factoriyal);
        //5factoriyal
       // int n=5;
        //int i=1;
        //int fact=1;
        //while(i<=n){
          //   fact *=i;
            // i++;
        //}
        //System.out.println(fact);
    }
}
