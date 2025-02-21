public class array6 {
    public static void main(String[] args) {
        int [] arr={4,7,9,8,3};
        int max=arr[0];
        for( int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("the maximum element in the array is"+max);
        
    }
}
