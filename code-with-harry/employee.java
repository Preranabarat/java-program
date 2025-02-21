class employee1{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
class cellPhone{
    public void ringing(){
        System.out.println("ringing.......");
    }
    public void vibrating(){
        System.out.println("vibrating......");
    }
    public void callFriend(){
        System.out.println("calling mukul....");
    }
       
}
public class employee {
    public static void main(String[] args) {
        //problem 1
        employee1 obj = new employee1();
        obj.setName("preranabarat");
        obj.salary=233;
        System.out.println(obj.getSalary());
        System.out.println(obj.getName());
        //problem 2
        cellPhone asus = new cellPhone();
        asus.callFriend();
        asus.vibrating();
        asus.ringing();

    }
    
}
