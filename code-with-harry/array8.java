public class array8 {
    public static void main(String[] args) {
        boolean isSorted = true;
        int [] arr={8,7,6,5,4};
        
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("the array is sorted");

        }
        else{
            System.out.println("the array is not sorted");
        }
    }
}
