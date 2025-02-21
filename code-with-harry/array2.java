public class array2 {
    public static void main(String[] args) {
        int [] marks={56,78,98,56,90};
        int num=56;
        boolean isInArray=false;
        for(int element:marks){
            if(num==element){
                isInArray=true;
                break;
            }
        }
        if(isInArray){
            System.out.println("the valu is prasent in the array");
        }
        else{
            System.out.println("the valu is not prasent in array");
        }
    }
}
