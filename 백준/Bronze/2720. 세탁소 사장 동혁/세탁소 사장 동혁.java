import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[][] rest = new int[n][4];

        for (int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0 ; i < n ; i ++){
            rest[i][0] = arr[i] / 25;
            rest[i][1] = arr[i] % 25 / 10;
            rest[i][2] = arr[i] % 25 % 10 / 5;
            rest[i][3] = arr[i] % 25 % 10 % 5;
        }

        for (int i = 0 ; i < n ; i ++){
            for (int j = 0 ; j < 4; j ++){
                System.out.print(rest[i][j] + " ");
            }
            System.out.println();
        }

    }
}