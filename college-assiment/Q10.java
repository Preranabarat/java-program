class A{
    public void MorningGreet(){
        System.out.println("Good Morning ");
    }
}

class B extends A{
    public void AfternoonGreet(){
        System.out.println("Good Afternoon");
    }
}

class C extends B{
    public void NightGreet(){
        System.out.println("Good Night");
    }
}

public class Q10 {
    public static void main(String[] args) {
        C obj = new C();
        obj.MorningGreet();
        obj.AfternoonGreet();
        obj.NightGreet();
    }
}
