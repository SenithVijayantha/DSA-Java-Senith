import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salary: ");
        int salary = sc.nextInt();
    /*
        Syntax of if statements:
        if (boolean expression T or F) {
            // body
        } else {
            // do this
        }
    */
        if (salary > 10000) {
            salary += 2000;
        } else {
            salary += + 1000;
        }

//    Multiple if-else

        if (salary > 10000) {
            salary += 2000;
        } else if (salary > 20000) {
            salary += 3000;
        } else {
            salary += 1000;
        }

        System.out.println(salary);

    }
}
