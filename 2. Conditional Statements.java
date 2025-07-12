import java.sql.SQLOutput;
import java.util.*;
public class Lecture_two {
    public static void main(String[] args) {
        //Conditional Statement:

        //Check the person is adult or not
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of a person: ");
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("The person is adult");
        } else {
            System.out.println("The person is not adult");
        }

        //Find the even and odd number:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

        //Take the input from and user and check (a==b), (a>b), and (a<b):
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a: ");
        int a = sc.nextInt();
        System.out.print("Enter the b: ");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("A is equal to B");
        } else if (a > b) {
            System.out.println("A is greater");
        } else {
            System.out.println("B is greater ");
        }

        //There is robert if we press 1 it will print hello, 2 it will print namaste, 3 it will print bonjour.
        Scanner sc = new Scanner(System.in);
        System.out.print("Press the button: ");
        int button = sc.nextInt();

        if (button == 1) {
            System.out.println("Hello");
        } else if (button == 2) {
            System.out.println("Namaste");
        } else if (button == 3) {
            System.out.println("Bonjour");
        } else {
            System.out.println("Invalid Bottom");
        }

        //Using Switch doing the same question
        Scanner sc = new Scanner(System.in);
        System.out.print("Press the button: ");
        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid Button");
        }

        //Homework Problems
        //1.Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows :
        //	1 : + (Addition) a + b
        //  2 : - (Subtraction) a - b
        //  3 : * (Multiplication) a * b
        //  4 : / (Division) a / b
        //  5 : % (Modulo or remainder) a % b
        //Calculate the result according to the operation given and display it to the user.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a:");
        int a = sc.nextInt();
        System.out.print("Enter the b:");
        int b = sc.nextInt();
        System.out.print("Press the button:");
        int button = sc.nextInt();

        if (button == 1) {
            System.out.println("Addition of two numbers: " + (a + b));
        } else if (button == 2) {
            System.out.println("Subtraction of two numbers: " + (a - b));
        } else if (button == 3) {
            System.out.println("Multiplication of two numbers: " + (a * b));
        } else if (button == 4) {
            System.out.println("Division of two numbers: " + (a / b));
        } else if (button == 5) {
            System.out.println("Modulo of two numbers: " + (a % b));
        } else {
            System.out.println("Invalid Input");
        }

        //2.Ask the user to enter the number of the month & print the name of the month. For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to print the month:");
        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
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
                System.out.println("Invalid Number");
        }
    }
}
