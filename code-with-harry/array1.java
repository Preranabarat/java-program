public class array1 {
    public static void main(String[] args) {
        float [] marks={45.7f,67.4f,63.4f,99.2f,100.0f};
        float sum=0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("the valu of sum is "+sum);
    }
}
