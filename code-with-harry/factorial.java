public class factorial{
    static int factorial1(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial1(n-1);
        }
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println("the value of factorial n is :" + factorial1(n));
    }
}