import java.util.*;

public class Lecture_three {
    public static void main(String[] args) {
        //Loops

        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");

        //For Loop
        for (int i=0; i<5; i++) {
            System.out.println("Hello world");
        }

        //Print the number from 0 to 10
        for (int i=0; i<11; i++) {
            System.out.println(i);
        }

        for (int i=0; i<11; i++) { //Single line
            System.out.print(i + " ");
        }

        //While Loop
        int i = 0;
        while (i < 11) {
            System.out.print(i + " ");
            i++;
        }

        //Do While Loop
        int i = 0;
        do {
            System.out.println(i+" ");
            i = i + 1;
        } while (i < 11);

        //Ques.Print the sum of first n natural numbers.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n number:");
        int num = sc.nextInt();
        int sum = 0;

        for (int i=1; i<=num; i++) {
            sum += i;
        }
        System.out.println("Sum of N Natural Numbers: " + sum);

        int i = 1;
        while (i<=num) {
            sum += i;
            i++;
        }
        System.out.println("Sum of N Natural Numbers: " + sum);

        do {
            System.out.println("Sum of N Natural Numbers: " + (sum += i));
            i++;
        } while (i<=num);

        //Ques.Print the table of a number input by the user.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to print the table:");
        int table = sc.nextInt();

        int i = 1;
        while (i<=10) {
            System.out.println((table * i));
            i++;
        }

        for (int i=1; i<=10; i++) {
            System.out.println(table * i);
        }

        //Homework Problems
        //1.Print all even numbers till n.
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the n range: ");
        int evenNum = sc.nextInt();

        for (int i=1; i<=evenNum; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //2.Print if a number n is prime or not (Input n from the user).
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        boolean isPrime = true;
        for (int i=2; i*i<=num; i++) {
            if(num % 2 == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) {
            if (num == 1) {
                System.out.println("This is neither prime not composite");
            }else {
                System.out.println("This is Prime Number");
            }
        }else {
            System.out.println("This is not a Prime Number");
        }
    }
}
