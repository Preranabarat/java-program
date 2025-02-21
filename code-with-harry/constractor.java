class myMainEmployee{
    private int id;
    private String name;
     
    public myMainEmployee(){
        id=45;
        name ="prerana barat";
    }
 
    public String getName() {
       return name;
    }
 
    public void setName(String n) {
       this.name = n;
    }
 
    public void setId(int i) {
       this.id = i;
    }
 
    public int getID() {
       return this.id;
    }
 }
public class constractor{
    public static void main(String[] args) {
        myMainEmployee obj =new myMainEmployee();
        System.out.println(obj.getID());
        System.out.println(obj.getName());

    }
}