public class cwh_35method_practice_qution{
    
    static void multiplication(int n){
        for(int i=1;i<=10;i++){
            System.out.format("%d x %d = %d\n",n,i,n*i);
        }
    }
    static void partten1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int sumRec(int n){
        if(n==1){
            return 1;
        }
        return n + sumRec(n-1);
    }
    static void partten2(int n){
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int fib(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }
    public static void main(String[] args) {
       //problem 1
       multiplication(17);
       //problem 2
       partten1(4);
       //problem 3
       int c=sumRec(3);
       System.out.println(c);
       //probelm 4
       partten2(4);
       //problem 5
       int result = fib(7);
       System.out.println(result);

    }
}