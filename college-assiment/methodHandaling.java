class Demo1 {
    public void method1() {
        System.out.println("method1 of Demo1 class is executed");
    }
}

class Demo2 extends Demo1 {
    public void method1() {
        System.out.println("method2 of Demo1 class is executed");
    }
}
public class methodHandaling{
    public static void main(String[] args) {
        Demo1 ob1 = new Demo1();
        Demo1 ob2 = new Demo2();
        ob1.method1();
        ob2.method1();
  
    }
}