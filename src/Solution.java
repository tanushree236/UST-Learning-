import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int W = scanner.nextInt();
        scanner.close();

        System.out.println(digitLimit(N, W));
    }

    public static int digitLimit(int N, int W) {
        int length = 0;
        int cost = 0;
        int currentNumber = N;

        while (cost <= W) {
            int numberOfDigits = String.valueOf(currentNumber).length();
            if (cost + numberOfDigits <= W) {
                cost += numberOfDigits;
                length++;
                currentNumber++;
            } else {
                break;
            }
        }

        return length;
    }
}