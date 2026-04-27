import java.io.*;
import java.util.*;

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
               "\nCost: " + cost +
               "\nManufacturer: " + manufacturer +
               "\nMax Discount: " + maxDiscount + "%\n";
    }

    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // File Reading
        try {
            BufferedReader br = new BufferedReader(new FileReader("products.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                String name = data[0];
                double cost = Double.parseDouble(data[1]);
                String manufacturer = data[2];
                double discount = Double.parseDouble(data[3]);

                list.add(new Product(name, cost, manufacturer, discount));
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        int choice;
        do {
            System.out.println("\nMenu");
            System.out.println("1. Display All Products");
            System.out.println("2. Display Products with 50% Discount");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Iterator<Product> it = list.iterator();
                    while (it.hasNext())
                        System.out.println(it.next());
                    break;

                case 2:
                    System.out.println("\nProducts with 50% Discount:");
                    Iterator<Product> it2 = list.iterator();
                    while (it2.hasNext()) {
                        Product p = it2.next();
                        if (p.getMaxDiscount() == 50) {
                            double finalPrice = p.getCost() * (1 - p.getMaxDiscount() / 100);
                            System.out.println("Product Name: " + p.getProductName());
                            System.out.println("Final Price: " + finalPrice + "\n");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}