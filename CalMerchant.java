import java.util.Scanner;

public class CalMerchant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับราคาต่อชิ้น
        System.out.print("Enter the price of the product (per unit): ");
        double price = scanner.nextDouble(); // ราคาต่อหน่วย

        // รับจำนวนสินค้า
        System.out.print("Enter the quantity of the product: ");
        int quantity = scanner.nextInt(); // จำนวนสินค้า

        // คำนวณราคารวมก่อนส่วนลด
        double total = price * quantity;

        // ตรวจสอบเงื่อนไขการลดราคา
        if (quantity > 10) {
            System.out.println("You get a 10% discount!");
            total = total * 0.9; // ลด 10%
        } else {
            System.out.println("No discount applied.");
        }

        // แสดงราคารวมหลังตรวจสอบส่วนลด
        System.out.println("Total price: " + total + " Baht");

        scanner.close();
    }
}
