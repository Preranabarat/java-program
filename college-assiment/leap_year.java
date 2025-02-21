public class leap_year {
   public static void main(String[] args) {
     int year=2004;
    if(year %4==0 && year %100!=0 || year %400==0){
        System.out.println("is leapyear");
    }
    else{
        System.out.println("not leapyear");
    }
   } 
}
