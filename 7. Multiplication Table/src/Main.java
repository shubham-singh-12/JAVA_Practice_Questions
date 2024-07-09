import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n---------- 7. Write a Java program that takes a number as input and prints its multiplication table up to 10. ----------");

        multiplicationTable();
        userInput();
    }


// Take Table input from the user only (default range: 10).
    public static void multiplicationTable() {
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter number to display table: ");
        int num = input.nextInt();

        int i = 1;
        while (i <= 10) {
            int table = num= i;
            System.out.println(num + " * " + i + " = " + table);
            i++;
        }
    }


// Take Table & Range input from the user.
    public static void userInput() {
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter number to display table: ");
        int num = input.nextInt();

        System.out.print("Enter range for the table: ");
        int range = input.nextInt();

        int i = 1;
        while (i <= range) {
            int table = num * i;
            System.out.println(num + " * " + i + " = " + table);
            i++;
        }
    }

}