import java.util.Scanner;

public class BuyProductSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- รับข้อมูลสินค้า ---
        System.out.print("Enter product 1 name: ");
        String p1 = sc.nextLine();
        System.out.print("Enter price: ");
        double price1 = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int qty1 = sc.nextInt();
        sc.nextLine(); // กันบั๊กเวลาใช้ nextLine ต่อ

        System.out.print("Enter product 2 name: ");
        String p2 = sc.nextLine();
        System.out.print("Enter price: ");
        double price2 = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int qty2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter product 3 name: ");
        String p3 = sc.nextLine();
        System.out.print("Enter price: ");
        double price3 = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int qty3 = sc.nextInt();

        System.out.print("Enter amount paid: ");
        double amountPaid = sc.nextDouble();

        // --- คำนวณ ---
        double total1 = price1 * qty1;
        double total2 = price2 * qty2;
        double total3 = price3 * qty3;

        double subtotal = total1 + total2 + total3;
        double vat = subtotal * 0.07;
        double total = subtotal + vat;
        double change = amountPaid - total;

        // --- แสดงผล ---
        System.out.println("\n----- Receipt -----");
        System.out.println(p1 + ": " + price1 + " x " + qty1 + " = " + total1 + " Baht");
        System.out.println(p2 + ": " + price2 + " x " + qty2 + " = " + total2 + " Baht");
        System.out.println(p3 + ": " + price3 + " x " + qty3 + " = " + total3 + " Baht");

        System.out.println("Subtotal: " + subtotal + " Baht");
        System.out.println("VAT 7%: " + vat + " Baht");
        System.out.println("Total including VAT: " + total + " Baht");
        System.out.println("Amount paid: " + amountPaid + " Baht");
        System.out.println("Change: " + change + " Baht");

        sc.close();
    }
}
