import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Product {
    private String productName;
    private double cost;
    private String manufacturer;
    private double maxDiscount;

    Product(String productName, double cost, String manufacturer, double maxDiscount) {
        this.productName = productName;
        this.cost = cost;
        this.manufacturer = manufacturer;
        this.maxDiscount = maxDiscount;
    }

    String getProductName() {
        return productName;
    }

    double getCost() {
        return cost;
    }

    String getManufacturer() {
        return manufacturer;
    }

    double getMaxDiscount() {
        return maxDiscount;
    }

    public String toString() {
        return "Product Name: " + productName +
               "\nCost: " + (int)cost +
               "\nManufacturer: " + manufacturer +
               "\nMax Discount: " + (int)maxDiscount + "%\n";
    }

    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        try {
            BufferedReader br = new BufferedReader(new FileReader("products.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                list.add(new Product(
                        data[0],
                        Double.parseDouble(data[1]),
                        data[2],
                        Double.parseDouble(data[3])
                ));
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Display All Products");
            System.out.println("2. Display Products with 50% Discount");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                        Iterator<Product> it = list.iterator();
                        while (it.hasNext()) {
                            System.out.println(it.next());
                        }
                    break;

                case 2:
                    System.out.println("Products with 50% Discount");
                    Iterator<Product> it2 = list.iterator();
                    while (it2.hasNext()) {
                        Product p = it2.next();
                        if (p.getMaxDiscount() == 50) {
                            double finalPrice = p.getCost() - (p.getCost() * 50 / 100);
                            System.out.println("Product Name: " + p.getProductName());
                            System.out.println("Final Price: " + (int)finalPrice);
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 3);

        sc.close();
    }
}