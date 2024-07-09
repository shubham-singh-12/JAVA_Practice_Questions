import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("1. Write a Java program to print 'Hello' on screen and your name on a separate line.");

        hello();
    }

    public static void hello(){
        Scanner input = new Scanner(System.in);

        System.out.print("\nPlease, Enter your Name: ");
        String name = input.nextLine();

        System.out.println("Hello");
        System.out.println(name);
    }
}