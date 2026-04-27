class CustomS {
    int roll;
    String name;
    String city;

    CustomS(int rollNo, String name, String city) {
        this.roll = rollNo;
        this.name = name;
        this.city = city;
    }

    public String toString() {
        return roll + " " + name + " " + city;
    }

    public static void main(String[] args) {
        CustomS s1 = new CustomS(101, "Atharv", "Hingna");
        CustomS s2 = new CustomS(102, "Pavan", "Mauda");

        System.out.println(s1);
        System.out.println(s2);
    }
}