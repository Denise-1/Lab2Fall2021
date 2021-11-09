
//IS147 Fall 2021
package Lab2.Print;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Johan");
        System.out.println("IS147 Fall 2021");
        System.out.println("Denise Chen");

        int monthNumber;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 12.");
        monthNumber = input.nextInt();
        switch (monthNumber) {
            case 1:
            System.out.println("January");
            break;
            case 2:
            System.out.println("February");
            break;
            case 3:
            System.out.println("March ");
            break;
            case 4:
            System.out.println("April");
            break;
            case 5:
            System.out.println("May");
            break;
            case 6:
            System.out.println("June");
            break;
            case 7:
            System.out.println("July");
            break;
            case 8:
            System.out.println("August");
            break;
            case 9:
            System.out.println("September");
            break;
            case 10:
            System.out.println("October");
            break;
            case 11:
            System.out.println("November");
            break;
            case 12:
            System.out.println("December");
            break;
            default:
            System.out.println("Invalid input. Choose a number between 1 to 12");
        }
            /* Part 2 */
            int number;
            System.out.println("Enter a number that corresponds to a month.");
            number = input.nextInt();
            if (number == 1)
                System.out.println("January");
            else if (number == 2)
                System.out.println("February");
            else if (number == 3)
                System.out.println("March");
            else if (number == 4)
                System.out.println("April");
            else if (number == 5)
                System.out.println("May");
            else if (number == 6)
                System.out.println("June");
            else if (number == 7)
                System.out.println("July");
            else if (number == 8)
                System.out.println("August");
            else if (number == 9)
                System.out.println("September");
            else if (number == 10)
                System.out.println("October");
            else if (number == 11)
                System.out.println("November");
            else if (number == 12)
                System.out.println("December");
            else
                System.out.println("Invalid number that corresponds to a month.");
        }
    }





