import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int cross_count = 1, prev_count_sum = 0;

        while(true){
            if(X <= prev_count_sum + cross_count){
                if(cross_count % 2 == 1){
                    System.out.println((cross_count - (X - prev_count_sum - 1)) + "/" + (X - prev_count_sum));
                    break;
                }else{
                    System.out.println((X-prev_count_sum) + "/" + (cross_count - (X - prev_count_sum - 1)));
                    break;
                }
            } else {
                prev_count_sum += cross_count;
                cross_count++;
            }
        }
    }
}