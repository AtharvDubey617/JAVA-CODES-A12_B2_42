class Human {
    public static void walk() {
        System.out.println("Human walks");
    }
}

class Boy extends Human {
    public static void walk() {
        System.out.println("Boy Walks");
    }
    public static void eat() {
        System.out.println("Boy Eats");
    }
    public static void main(String[] args) {
        Human obj = new Boy();
        walk();
        // obj.eat();
    }
}