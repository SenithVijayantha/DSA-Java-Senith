import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int empID = in.nextInt();
        System.out.println("Enter the employee ID: ");
        String department = in.next();
        System.out.println("Enter your department: ");

        switch (empID) {
            case 1:
                System.out.println("Kunal Kushwaha");
                break;
            case 2:
                System.out.println("Rahul Rana");
                break;
            case 3:
                System.out.println("Employee Number 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department entered");
                }
                break;
            default:
                System.out.println("Enter a valid employee ID");
        }

//        Enhanced nested switch case
        switch (empID) {
            case 1 -> System.out.println("Kunal Kushwaha");
            case 2 -> System.out.println("Rahu Rana");
            case 3 -> {
                System.out.println("Employee Number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter a valid employee ID");

        }


    }
}
