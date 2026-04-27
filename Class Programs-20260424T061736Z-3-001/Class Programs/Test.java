// import java.util.Scanner;

// class Test {
//     int a, b, c, d;

//     Test(int a, int b, int c, int d) {
//         this.a = a;
//         this.b = b;
//         this.c = c;
//         this.d = d;
//     }

//     Test add(Test obj) {
//         int s1 = this.a + obj.a;
//         int s2 = this.b + obj.b;
//         int s3 = this.c + obj.c;
//         int s4 = this.d + obj.d;

//         Test temp = new Test(s1, s2, s3, s4);
//         return temp;
//     }

//     void display() {
//         System.out.println("a = " + a);
//         System.out.println("b = " + b);
//         System.out.println("c = " + c);
//         System.out.println("d = " + d);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a: ");
//         int a = sc.nextInt();
//         System.out.print("Enter b: ");
//         int b = sc.nextInt();
//         System.out.print("Enter c: ");
//         int c = sc.nextInt();
//         System.out.print("Enter d: ");
//         int d = sc.nextInt();

//         Test obj1 = new Test(a, b, c, d);

//         System.out.println("\nEnter second object values");

//         System.out.print("Enter a: ");
//         int a2 = sc.nextInt();
//         System.out.print("Enter b: ");
//         int b2 = sc.nextInt();
//         System.out.print("Enter c: ");
//         int c2 = sc.nextInt();
//         System.out.print("Enter d: ");
//         int d2 = sc.nextInt();

//         Test obj2 = new Test(a2, b2, c2, d2);

//         Test result = obj1.add(obj2);

//         System.out.println("Sum of objects:");
//         result.display();
//     }
// }

class Test {
    int a;

    Test(int a) {
        this.a = a;
    }

    Test add(Test obj) {
        Test s1 = this.a + obj.a;
        
        return s1;
    }

    void display() {
        System.out.println("a = " + a);
    }

    public static void main(String[] args) {
        Test t1 = new Test(1);
        Test t2 = new Test(2);
        int result = t1.add(t2);
        System.out.println(result);
    }
}