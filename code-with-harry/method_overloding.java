public class method_overloding {

    static void change(int []arr){
        arr[0]=98;
    }
    static void teljok(){
        System.out.println("i invanted a new world,\nplagiarism!");
    }
    public static void main(String[] args) {
        teljok();
        int [] marks={34,45,35,60};
        change(marks);
        System.out.println(marks[0]);
    }
}
