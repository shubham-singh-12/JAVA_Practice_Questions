public class Main {
    public static void main(String[] args) {
        System.out.println("---------- 9. Write a Java program to compute the specified expressions and print the output. ----------");

        specificExpression(25.5, 3.5, 40.5, 4.5);
    }

    public static void specificExpression(double num1, double num2, double num3, double num4) {
        double result = ((num1 * num2 - num2 * num2) / (num3 - num4));

        System.out.println("\nResult of " + "((" + num1 + " * " + num2 + " - " + num2 + " * " + num2 + ") /" + "(" + num3 + " - " + num4 + "))" + " is: " + result);
    }
}