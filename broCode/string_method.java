package broCode;

public class string_method {
    public static void main(String[] args) {
        String name =" Prerana Barat ";


        int length=name.length();
        System.out.println(length);

        char letter=name.charAt(1);
        System.out.println(letter);

        int index=name.indexOf("r");
        System.out.println(index);

        int lastIndex=name.lastIndexOf("a");
        System.out.println(lastIndex);

        name =name.toUpperCase();
        System.out.println(name);

        name=name.toLowerCase();
        System.out.println(name);

        name=name.trim();
        System.out.println(name);

        name=name.replace("a", "o");
        System.out.println(name);

        System.out.println(name.isEmpty());


        System.out.println(name.contains(" "));


        String password ="prerana123";

        System.out.println(password.equals("prerana123"));


        System.out.println(password.equals("bdgfhdbnmvfgbn"));

        
        System.out.println(password.equalsIgnoreCase("PRERANA123"));

    }
    
}
