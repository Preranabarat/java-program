public class string1{
    public static void main(String[] args) {
        String name="prerana";
        //lenth print
        int value=name.length();
        System.out.println(value);
        //uppercase the string
        String ustring=name.toUpperCase();
        System.out.println(ustring);
        //trimmed the string 
        String nonTrimmedString="    prerana barat  ";
        //with space
        System.out.println(nonTrimmedString);

        //withoutSpace
        String trimmedString=nonTrimmedString.trim();
        System.out.println(trimmedString);
        //substring
        System.out.println(name.substring(2));
        //match string 
        System.out.println(name.equals("prerana"));
    }
}