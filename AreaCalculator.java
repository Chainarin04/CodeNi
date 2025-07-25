import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Triangle
        System.out.print("Enter the base of the triangle: ");
        double base = input.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = input.nextDouble();

        double triangleArea = 0.5 * base * height;
        System.out.println("Area of the triangle: " + triangleArea + " square units");

        // Square (as a rectangle with equal sides)
        System.out.print("Enter the length of the rectangle: ");
        double length = input.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = input.nextDouble();

        double rectangleArea = length * width;
        System.out.println("Area of the rectangle: " + rectangleArea + " square units");
    }
}
