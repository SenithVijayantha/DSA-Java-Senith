import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
        * Syntax of for loops:
        *
        * for (initialization; condition; increment/decrement) {
        *   // body
        * }
        */

        //        Q: Print numbers from 1 to 5

        System.out.println("For loop");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

//        Print numbers from 1 to n
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = userInput.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");
        }

//        While loops

        /*
        * while (condition) {
        *   // body
        * }
        * */

        System.out.println("While Loop");

        int num = 1;
        while (num <= n) {
            System.out.print(num + " ");
            num++;
        }

//        do while

        System.out.println("Do while");

        num = 0;

        do {
            System.out.print(num + " ");
            num++;
        } while (num <= n);
    }
}
