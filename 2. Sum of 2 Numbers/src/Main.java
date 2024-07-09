import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("---------- 2. Write a Java program to print the sum of two numbers.----------\n");

        sumTwoNumbers(74, 36);
        userInput();
    }

    public static void sumTwoNumbers(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("The Sum of " + num1 + " and " + num2 + " is: " + sum);
    }

    public static void userInput(){

        System.out.println("\n---------- Take input from the user. ----------");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st Number: ");
        int num1 = input.nextInt();

        System.out.print("Enter 2nd Number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum of " + num1 + " + " + num2 + " is: " + sum);
    }
}