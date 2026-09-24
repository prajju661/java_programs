
public class max {
    public static void main(String[] a){
        int[] arr={2,4,7,11,3};
        int maximum=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maximum){
                maximum=arr[i];
            }
        }
        System.out.println("Maximum value is: "+maximum);   
    }
}
