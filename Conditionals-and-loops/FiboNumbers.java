import java.util.Scanner;

public class FiboNumbers {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int previousNum = 0;
        int currentNum = 1;
        int count = 2;

//        Edge cases: 0 and 1
        if (n == 0) {
            System.out.println(0);
        } else if (n == 1) {
            System.out.println(1);
        } else {
            while (count <= n) {

                int temp = previousNum;
                previousNum = currentNum;
                currentNum = temp + previousNum;
                count++;
            }
        }



        System.out.println(currentNum);
    }
}
