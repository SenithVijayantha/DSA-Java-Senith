import java.util.Scanner;

public class LargeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

//        Q: Find the largest of the 3 numbers

//        Using if
        int max = a;

        if (b > max) {
            max = b;
        } if (c > max) {
            max = c;
        }

        System.out.println(max);

//        Using Math.max

        max = Math.max(c, Math.max(a,b));
        System.out.println(max);
    }
}
