class ComplexNumber {
    double real;
    double imaginary;
    ComplexNumber(double r, double i) {
        real = r;
        imaginary = i;
    }
    void addComplex(double r, double i) {
        real += r;
        imaginary += i;
    }
    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
    void displaySum() {
        System.out.print("Sum of Complex Numbers: " + real + " + " + imaginary + "i");
    }
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3, 4);
        ComplexNumber c2 = new ComplexNumber(1, 2);
        System.out.println("First Complex Number: ");
        c1.display();
        System.out.println("Second Complex Number: ");
        c2.display();
        c1.addComplex(c2.real, c2.imaginary);
        c1.displaySum();
    }
}