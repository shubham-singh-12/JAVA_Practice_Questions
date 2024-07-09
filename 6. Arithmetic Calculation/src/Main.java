import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("---------- 6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. ----------");

        arithmeticOperations();
    }

    public static void arithmeticOperations() {
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter 1st Number: ");
        int num1 = input.nextInt();

        System.out.print("Enter 2nd Number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("\nSum(addition) of " + num1 + " + " + num2 + " is: " + sum);

        int subtract = num1 - num2;
        System.out.println("Subtraction of " + num1 + " - " + num2 + " is: " + subtract);

        int multiply = num1 * num2;
        System.out.println("Multiplication of " + num1 + " * " + num2 + " is: " + multiply);

        int division = num1 / num2;
        System.out.println("Division of " + num1 + " / " + num2 + " is: " + division);

        int modulus = num1 % num2;
        System.out.println("The Remainder(modulus) of " + num1 + " mod " + num2 + " is: " + modulus);
    }
}