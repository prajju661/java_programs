/* 
public class reverse {
    public static void main(String[] a){
        int[] arr={1,2,3,4,5};
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
*/
public class reverse {
    public static void main(String[] a) {
        int[] arr = {1,2,3,4,5};
        int temp;
        for (int i=0,j=arr.length-1;i<j;i++,j--) {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
