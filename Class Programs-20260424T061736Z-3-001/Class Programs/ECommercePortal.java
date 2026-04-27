class ECommercePortal {
    double cartValue, finalAmount;
    double discount = 0.0;

    void checkout(double cartValue) {
        this.cartValue = cartValue;
        if (cartValue >= 1200)
            discount = cartValue * 0.25;
        else
            discount = cartValue * 0.15;
        finalAmount = cartValue - discount;
        display();
    }

    void checkout(double cartValue, String couponCode) {
        this.cartValue = cartValue;
        if (cartValue < 600)
            discount = 20;
        else if (cartValue >= 600 && couponCode == "SAVE10")
            discount = cartValue * 0.1;
        else {
            discount = 0.0;
            System.err.println("Invalid Coupon Code");
        }
        finalAmount = cartValue - discount;
        display();
    }

    void display() {
        System.out.println("The cart value: " + cartValue);
        System.out.println("Discount Applied: " + discount);
        System.out.println("Final Payable Amount: " + finalAmount);
        System.err.println("--------------\n");
    }

    public static void main(String[] args) {
        ECommercePortal e = new ECommercePortal();
        e.checkout(500);
        e.checkout(800, "SAVE10");
        e.checkout(6000);
    }
}