import java.util.Scanner;

public class HourGlass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows you want");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns you want");
        int colm = sc.nextInt();

        int arr[][] = new int[rows][colm];

        //input
        for(int i=0; i<rows; i++)
            for(int j=0;j<colm;j++)
                arr[i][j] = sc.nextInt();

        int sumMax = Integer.MIN_VALUE;
        int temp = 0;

        //output
        for (int i=0; i< arr.length-2;  i++)
            for (int j=0;j< arr.length-2; j++)
                temp = arr[i][j] + arr[i][j+1]+ arr[i][j+2]+ arr[i+1][j+1]+ arr[i+2][j]+ arr[i+2][j+1]+ arr[i+2][j+2];
                if (temp>sumMax){
                    sumMax=temp;
                }
        System.out.println(sumMax);
    }
}
