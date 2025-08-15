import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // รับค่า Fahrenheit
        System.out.print("กรอกค่าอุณหภูมิ (°F): ");
        double fahrenheit = input.nextDouble();

        // คำนวณ Celsius
        double celsius = (5.0 / 9.0) * (fahrenheit - 32);

        // แสดงผล
        System.out.println("อุณหภูมิฟาเรนไฮต์: " + fahrenheit + " °F");
        System.out.println("อุณหภูมิเซลเซียส: " + celsius + " °C");

        input.close();
    }
}
