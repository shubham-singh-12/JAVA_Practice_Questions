public class Main {
    public static void main(String[] args) {

        System.out.println("\n---------- 4. Write a Java program to print the results of the following operations. ----------");

        sum1(-5, 8, 6);
        sum2(55, 9, 9);
        sum3(20, -3, 5, 8);
        sum4(5, 15, 3, 2, 8, 3);
    }

    public static void sum1(int num1, int num2, int num3) {
        int result1 = num1 + num2 * num3;
        System.out.println("\nResult of " + num1 + " + " + num2 + " * " + num3 + " is: " + result1);
    }

    public static void sum2(int num1, int num2, int num3){
        int result2 = (num1 + num2) % num3;
        System.out.println("\nResult of (" + num1 + " + " + num2 + ") % " + num3 + " is: " + result2);
    }

    public static void sum3(int num1, int num2, int num3, int num4) {
        int result3 = num1 + num2 * num3 / num4;
        System.out.println("\nResult of " + num1 + " + " + num2 + " * " + num3 + " / " + num4 + " is: " + result3);
    }

    public static void sum4(int num1, int num2, int num3, int num4, int num5, int num6) {
        int result4 = num1 + num2 / num3 * num4 - num5 % num6;
        System.out.println("Result of " + num1 + " + " + num2 + " / " + num3 + " * " + num4 + " - " + num5 + " % " + num6 + " is: " + result4);
    }

}