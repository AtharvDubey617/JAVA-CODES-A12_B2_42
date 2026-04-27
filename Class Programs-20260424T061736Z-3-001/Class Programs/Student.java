package Arrays;

public class Student {
    String name, rollNo;
    int[] marks;

    Student(String name, String rollNo, int[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        for (int i = 0; i < marks.length; i++)
            System.out.println("Marks " + (i + 1) + ": " + marks[i]);
        System.out.println();
    }

    public static void main(String[] args) {
        Student[] s = new Student[3];

        s[0] = new Student("Amit", "CSE241234", new int[]{78, 85, 80});
        s[1] = new Student("Neha", "CSE245678", new int[]{88, 90, 92});
        s[2] = new Student("Rohit", "CSE249876", new int[]{70, 75, 72});

        for (int i = 0; i < s.length; i++)
            s[i].display();

        String searchRollNo = "CSE245678";
        for (int i = 0; i < s.length; i++) {
            if (s[i].rollNo.equals(searchRollNo)) {
                System.out.println("Searching for Roll No: " + searchRollNo);
                s[i].display();
            }
        }

        int subjects = s[0].marks.length;
        int[] avg = new int[subjects];

        for (int i = 0; i < subjects; i++) {
            int sum = 0;
            for(int j = 0; j < s.length; j++) {
                sum += s[j].marks[i];
            }
            avg[i] = sum / 3;
        }

        System.out.println("Average Marks");
        for (int i = 0; i < avg.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + avg[i]);
        }
    }
}