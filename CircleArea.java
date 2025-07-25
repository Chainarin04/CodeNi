import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = input.nextDouble();

        double area = Math.PI * radius * radius;

        System.out.printf("Area of circle that has radius = %.1f meters is %.5f square meters.%n", radius, area);
    }
}
