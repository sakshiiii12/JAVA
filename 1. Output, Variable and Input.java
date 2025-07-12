import java.util.*;

public class Lecture_one {
    public static void main(String[] args) {
        //Output
        System.out.print("Hello World"); //print without giving a line
        System.out.println("Hello World With Java"); //println gives a next line
        System.out.println("Hello World With Java\n"); //3rd way to print

        //Ques
        //*
        //* *
        //* * *
        //* * * *
        System.out.println("*");
        System.out.println("*\t*");
        System.out.println("*\t*\t*");
        System.out.println("*\t*\t*\t*");

        //Quiz
        //*
        //* *
        System.out.println("*\n**");

        //Variables: Hold or store the data
        String name = "Sakshi Yadav";
        int age = 48;
        int num1 = 25;
        int num2 = 10;
        double price = 25.25;

        int a = 10;
        int b = 25;
        int sum = a + b;
        System.out.println(sum);
        int diff = b - a;
        System.out.println(diff);
        int mul = a * b;
        System.out.println(mul);

        //Quiz
        //to calculate : (a*b)/(a-b)
        int a = 10;
        int b = 5;
        int ans = (a * b) / (a - b);
        System.out.println(ans);

        //Input
        Scanner sc = new Scanner(System.in);
        String name = sc.next(); //it will allow only one tokens like sakshi
        String name2 = sc.nextLine(); //it will allow many tokens like sakshi yadav
        //nextInt()
        //nextFloat()
        System.out.println(name);

        //Ques Take 2 variables 'a' and 'b' and print their sum
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);

        //Homework Problems
        //1.Try to declare meaningful variables of each type. Eg - a variable named age should be a numeric type (int or float) not byte.
        int age = 21;
        float temperature = 150.23f;
        boolean isVote = true;
        char grade = 'A';
        String name = "Santosh";
        double price = 1999.99;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Temperature: " + temperature);
        System.out.println("The person can vote: " + isVote);
        System.out.println("Grade: " + grade);
        System.out.println("Price: " + price);

        //2.Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int radius = sc.nextInt();

        float pi = 3.14f;
        double circumference = 2 * pi * radius;
        double area = pi * radius * radius;

        System.out.println("Circumference of the circle: " + circumference);
        System.out.println("Area of the circle: " + area);

        //3.Make a program that prints the table of a number that is input by the user.
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number:");
       int num = sc.nextInt();
       System.out.println(num + "x 1 = " + (num * 1));
       System.out.println(num + "x 2 = " + (num * 2));
       System.out.println(num + "x 3 = " + (num * 3));
       System.out.println(num + "x 4 = " + (num * 4));
       System.out.println(num + "x 5 = " + (num * 5));
       System.out.println(num + "x 6 = " + (num * 6));
       System.out.println(num + "x 7 = " + (num * 7));
       System.out.println(num + "x 8 = " + (num * 8));
       System.out.println(num + "x 9 = " + (num * 9));
       System.out.println(num + "x 10 = " + (num * 10));

    }
}
