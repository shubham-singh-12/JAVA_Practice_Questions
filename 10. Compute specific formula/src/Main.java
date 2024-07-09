public class Main {
    public static void main(String[] args) {

        System.out.println("---------- 10. Write a Java program to compute a specified formula. ----------");

        computeFormula(4.0f, 1, 1.0f, 3, 5, 7, 9, 11);
    }

    public static void computeFormula(float num1, int num2, float num3, int num4, int num5, int num6, int num7, int num8) {
        int result = num1 * (num2 - (num3 / num4) + (num3 / num5) - (num3 / num6) + (num3 / num7) + (num3 / num8));
        
    }
}