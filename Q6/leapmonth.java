import java.util.Scanner;

public class leapmonth {
    public static void main(String[] args) {
        int year;
        boolean isLeapMonth;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        year = input.nextInt();

        isLeapMonth = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (isLeapMonth) {
            System.out.println(year + " is a Leap Month (Leap Year).");
        } else {
            System.out.println(year + " is NOT a Leap Month.");
        }

        input.close();
    }
}
