import java.util.Scanner;
// swap the kth element from the start with the kth element from the end of the array.

public class SwapKthElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] =new int[size];
        int k = 2;

            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            if (k < size) {
                int temp = arr[k - 1];
                arr[k - 1] = arr[size - k];
                arr[size - k] = temp;
            }

            for (int i=0;i<size;i++){
            System.out.println(arr[i]);
        }

    }
}
