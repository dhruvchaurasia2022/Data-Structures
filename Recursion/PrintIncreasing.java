package Recursion;

import java.util.*;

public class PrintIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        _helperPrintIncreasing(n);
    }

    public static void _helperPrintIncreasing(int n) {
        // base case
        if (n == 0) {
            return;
        }

        _helperPrintIncreasing(n - 1);
        System.out.println(n);
    }
}
