import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int a[] = new int [n];
        for (int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i<n; i++){
           // System.out.println(a[i]);
            sum = sum+a[i];


        }
        System.out.println(sum);
    }
}
