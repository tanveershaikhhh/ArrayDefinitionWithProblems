public class CyclicRotate {
   public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};
        int end = arr[arr.length - 1];

        for (int i=arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[0] = end;
            System.out.println(arr[i]);

        }
    }
}
