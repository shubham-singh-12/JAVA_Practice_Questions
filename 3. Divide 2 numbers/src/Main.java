import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n---------- 3. Write a Java program to divide two numbers and print them on the screen. ----------");

        divideNumbers(50, 3);
        userInput();
    }

    public static void divideNumbers(int num1, int num2) {
        int divide = num1 / num2;
        System.out.println("\nThe result of " + num1 + "/" + num2 + " is: " + divide );
    }

    public static void userInput(){

        System.out.println("\n---------- Take input from user. ----------");
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter 1st Number: ");
        int num1 = input.nextInt();

        System.out.print("Enter 2nd Number: ");
        int num2 = input.nextInt();

        int division = num1 / num2;
        System.out.print("\nDivision of " + num1 + "/" + num2 + " is: " + division);
    }
}