class employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println("mt id is"+id);
        System.out.println("and my nameis "+name);
    }
}
public class custom_class{
    public static void main(String[]args){
        System.out.println("this is our custom class");
        employee obj = new employee();
        obj.id =12;
        obj.name ="preranabarat";
        
        obj.printDetails();
    }
}