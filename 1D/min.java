
public class min {
    public static void main(String[] a){
        int[] arr={2,4,7,11,3};
        int minimum=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<minimum){
                minimum=arr[i];
            }
        }
        System.out.println("Minimum value is: "+minimum);   
    }
    
}
