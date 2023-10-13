package Array;
import java.io.*;
import java.util.*;

public class SubArray {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];
        
        for (int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int sum=0;
        int count = 0;
        
        for(int i=0 ; i<n; i++){
            for (int j=i; j<n;j++){
                sum += arr[j];
                if(sum<0){
                    count++;
                }
            }
            sum = 0;
        }
        System.out.println(count);
    }
}
