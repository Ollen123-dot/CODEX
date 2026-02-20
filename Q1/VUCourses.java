package Q1;

import java.util.Scanner;

public class VUCourses {
    public static void main(String[] args) {
        String moduleName = "";
        String moduleCode;
        int tuition = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("====== Welcome to VUPay System ======");
        System.out.print("Enter Module Code (BSF, BIT, BCS, BCE): ");
        moduleCode = input.nextLine().toUpperCase();

        switch (moduleCode) {
            case "BSF":
                moduleName = "BSc. Software Engineering";
                tuition = 900000;
                break;
            case "BIT":
                moduleName = "BSc. Information Technology";
                tuition = 750000;
                break;
            case "BCS":
                moduleName = "BSc. Computer Science";
                tuition = 800000;
                break;
            case "BCE":
                moduleName = "BSc. Computer Engineering";
                tuition = 950000;
                break;
            default:
                System.out.println("Wrong Module Code details");
                input.close();
                return;
        }

        System.out.println("\n===== Course Details =====");
        System.out.println("Module Name: " + moduleName);
        System.out.println("Module Code: " + moduleCode);
        System.out.println("Tuition Fee: UGX " + tuition);

        input.close();
    }
}
