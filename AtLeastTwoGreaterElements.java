import java.util.Arrays;
import java.util.Scanner;

public class AtLeastTwoGreaterElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];

        int temp [] = new int[arr.length-2];

        //inpuy
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();


        }
        Arrays.sort(arr);

        for (int i = 0; i < size-2; i++) {
            temp[i] = arr[i];
            System.out.println(temp[i]);

        }

    }
}
