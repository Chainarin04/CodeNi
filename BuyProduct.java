import java.util.Scanner;

public class BuyProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับชื่อและราคาสินค้า 3 รายการ
        System.out.print("Product 1 name: ");
        String name1 = sc.nextLine();
        System.out.print("Product 1 price: ");
        double price1 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Product 2 name: ");
        String name2 = sc.nextLine();
        System.out.print("Product 2 price: ");
        double price2 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Product 3 name: ");
        String name3 = sc.nextLine();
        System.out.print("Product 3 price: ");
        double price3 = sc.nextDouble();

        // กำหนด VAT เป็น 7%
        double vatRate = 7.0;

        // รับเงินจากลูกค้า
        System.out.print("Customer paid money: ");
        double paid = sc.nextDouble();

        // คำนวณ
        double total = price1 + price2 + price3;
        double vat = total * (vatRate / 100);
        double netPrice = total + vat;
        double change = paid - netPrice;

        // แสดงผล
        System.out.println("\n----- Receipt -----");
        System.out.println(name1 + ": " + price1 + " baht");
        System.out.println(name2 + ": " + price2 + " baht");
        System.out.println(name3 + ": " + price3 + " baht");
        System.out.println("Total before VAT: " + total + " baht");
        System.out.println("VAT (7%): " + vat + " baht");
        System.out.println("Total after VAT: " + netPrice + " baht");
        System.out.println("Paid: " + paid + " baht");
        System.out.println("Change: " + change + " baht");

        sc.close();
    }
}
