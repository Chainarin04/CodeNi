import java.util.Scanner;

public class TotalPriceCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // รับราคาสินค้าต่อชิ้น
        System.out.print("Enter the price per item (บาท): ");
        double pricePerItem = input.nextDouble();

        // รับจำนวนสินค้า
        System.out.print("Enter the quantity of products (ชิ้น): ");
        int quantity = input.nextInt();

        // คำนวณราคารวม
        double totalPrice = pricePerItem * quantity;

        // รับส่วนลด (%)
        System.out.print("Enter discount (%): ");
        double discountPercent = input.nextDouble();

        // คำนวณส่วนลดและราคาสุทธิ
        double discountAmount = (discountPercent / 100) * totalPrice;
        double finalPrice = totalPrice - discountAmount;

        // แสดงผลแบบใบเสร็จ
        System.out.println("\n--------- ใบสรุปการชำระเงิน ---------");
        System.out.printf("Price per piece           : %.2f บาท\n", pricePerItem);
        System.out.printf("Number of products        : %d ชิ้น\n", quantity);
        System.out.printf("Price includes products   : %.2f บาท\n", totalPrice);
        System.out.printf("discount %.0f%%              : %.2f บาท\n", discountPercent, discountAmount);
        System.out.println("-----------------------------------");
        System.out.printf("Amount to be paid : %.2f บาท\n", finalPrice);
        System.out.println("-----------------------------------");

        input.close();
    }
}
