import Arrays.Student;

class Student {
    public int roll_no;
    public String name;
    Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    } 
    void display() {
        System.out.println("Name: " + name + " and Roll No: " + roll_no);
    }
}

public class ObjectArrayDemo {
    public static void main(String[] args) {
        Student[] arr = new Student[5];
        arr[0] = new Student(1, "Aman");
        arr[1] = new Student(2, "Riddhesh");
        arr[2] = new Student(3, "Rohan");
        arr[3] = new Student(4, "Aryan");
        arr[4] = new Student(5, "Nikhil");
        for(Student arr1 : arr) 
            arr1.display();
    }
}