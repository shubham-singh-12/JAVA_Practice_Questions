import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("---------- 5. Write a Java program that takes two numbers as input and displays the product of two numbers. ----------");

        productOfNumbers();
    }

    public static void productOfNumbers(){
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter 1st Number:");
        int num1 = input.nextInt();

        System.out.print("Enter 2nd Number: ");
        int num2 = input.nextInt();

        int product = num1 * num2;
        System.out.println("\nProduct of " + num1 + " * " + num2 + " is: " + product);
    }
}