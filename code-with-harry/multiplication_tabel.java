public class multiplication_tabel {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=10;i++){
            System.out.printf("%d X %d =%d\n",n,i,n*i);
        }
        //10 multiplication_reverce order
        int n=10;
        for(int i=10;i>=1;i--){
            System.out.printf("%d X %d =%d\n",n,i,n*i);
        }
         //8multiplication tabel
         int n=8;
         int sum=0;
        for(int i=1;i<=10;i++){
            sum += n*i;
        }
        System.out.println(sum);
    }
    
}
