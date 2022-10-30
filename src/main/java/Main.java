/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("This program will sum the numbers from 1 to n. Please enter a number n:");
        int n = sc.nextInt();
        System.out.println("The sum of 1 to " + n + " is " + sumOfNumbers(n));
        System.out.println("The sum of 1 to " + n + " is " + gaussianSumOfNumbers(n));
    }


    static int sumOfNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    // for Extra Credit
    static int gaussianSumOfNumbers(int n) {
        int sum2 = (n*(n + 1)) / 2;
        return sum2;
    }

}
// for Extra extra credit - compare the methods and show which one is faster

