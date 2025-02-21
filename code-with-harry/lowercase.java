public class lowercase {
    public static void main(String[] args){
        //problem 1
        String name= "Prerana Batrat";
        System.out.println(name.toLowerCase());
        //problem 2
        String text="to lower case";
        text= text.replace(" ","_");
        System.out.println(text);
        //problem 3
        String letter= "dear <|name|>,thanks a lot!";
         letter=letter.replace("<|name|>","prerana");
         System.out.println(letter);

         //problem 4
         String myString= "this string contains   double  and triple space";
         System.out.println(myString.indexOf("  "));
         System.out.println(myString.indexOf("   "));
         //problem 5
         String myLetter="dear prerana,\n\t this java corces nice .\n\tthanks!";
         System.out.println(myLetter);

        }
}
