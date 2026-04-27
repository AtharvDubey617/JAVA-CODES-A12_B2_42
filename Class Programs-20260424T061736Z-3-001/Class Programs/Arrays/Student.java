package Arrays;

import java.util.Scanner;

class Student {
    String name, rollNo;
    int[] marks;
    int total;
    double percentage;
    char grade;

    Student(String name, String rollNo, int[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
        calculateResult();
    }

    void calculateResult() {
        total = 0;
        for (int m : marks)
            total += m;
        percentage = total / (double) marks.length;

        if (percentage >= 90) grade = 'A';
        else if (percentage >= 75) grade = 'B';
        else if (percentage >= 60) grade = 'C';
        else if (percentage >= 50) grade = 'D';
        else grade = 'F';
    }

    void display() {
        System.out.println("\nName: " + name);
        System.out.println("Roll No: " + rollNo);
        for (int i = 0; i < marks.length; i++)
            System.out.println("Marks Subject " + (i + 1) + ": " + marks[i]);
        System.out.println("Total: " + total);
        System.out.printf("Percentage: %.2f\n", percentage);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];
        int subjects = 5;

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Roll No: ");
            String rollNo = sc.nextLine();

            int[] marks = new int[subjects];
            for (int j = 0; j < subjects; j++) {
                System.out.print("Enter marks for Subject " + (j + 1) + ": ");
                marks[j] = sc.nextInt();
            }
            sc.nextLine();
            students[i] = new Student(name, rollNo, marks);
        }

        System.out.println("\nAll Students:");
        for (Student st : students)
            st.display();

        int[] avg = new int[subjects];
        for (int i = 0; i < subjects; i++) {
            int sum = 0;
            for (int j = 0; j < students.length; j++)
                sum += students[j].marks[i];
            avg[i] = sum / students.length;
        }

        System.out.println("\nAverage Marks:");
        for (int i = 0; i < avg.length; i++)
            System.out.println("Subject " + (i + 1) + ": " + avg[i]);

        System.out.print("\nEnter Name or Roll No to search: ");
        String key = sc.nextLine();

        for (Student st : students) {
            if (st.rollNo.equals(key)) {
                System.out.println("Student Found:");
                st.display();
            }
        }

        int maxIndex = 0;
        for (int i = 1; i < students.length; i++) {
            if (students[i].total > students[maxIndex].total) {
                maxIndex = i;
            }
        }
        
        System.out.println("\nStudent with Highest Marks:");
        students[maxIndex].display();

        sc.close();
    }
}