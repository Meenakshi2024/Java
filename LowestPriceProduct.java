import java.util.Scanner;

class Product {
    int pcode;
    String pname;
    double price;

    public Product(int pcode, String pname, double price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }
}

public class LowestPriceProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product[] products = new Product[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter product code: ");
            int pcode = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter product name: ");
            String pname = scanner.nextLine();
            System.out.print("Enter product price: ");
            double price = scanner.nextDouble();

            products[i] = new Product(pcode, pname, price);
        }


        Product lowestPriceProduct = products[0];
        for (int i = 1; i < products.length; i++) {
            if (products[i].price < lowestPriceProduct.price) {
                lowestPriceProduct = products[i];
            }
        }

        System.out.println("Product with the lowest price: " + lowestPriceProduct.pname);
    }
}

