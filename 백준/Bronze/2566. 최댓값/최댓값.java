import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int max = 0;
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0 ; i < 9 ; i ++){
            for(int j = 0 ; j < 9 ; j++){
                arr[i][j] = sc.nextInt();
                if(arr[i][j] > max){ max = arr[i][j]; maxRow = i; maxCol = j;}
            }
        }

        System.out.println(max);
        System.out.println((maxRow + 1) + " " + (maxCol + 1));

    }

}