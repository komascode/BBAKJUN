import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sidePoints = (int)Math.pow(2, n) + 1;

        int result = sidePoints * sidePoints;

        System.out.println(result);
    }
}