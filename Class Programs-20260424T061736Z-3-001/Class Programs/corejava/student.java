package corejava;

class student {
    private String Name;
    private String Enroll;
    private int[] marks;

    public student(String Name, String Enroll, int[] marks) {
        this.Name = Name;
        this.Enroll = Enroll;
        this.marks = marks;
    }

    public student() {
        this.Name = "";
        this.Enroll = "";
        this.marks = null;
    }

    public void setData(String Name, String Enroll, int[] marks) {
        this.Name = Name;
        this.Enroll = Enroll;
        this.marks = marks;
    }

    public String getName() {
        return Name;
    }

    public int[] getMarks() {
        return marks;
    }

    public String getEnroll() {
        return Enroll;
    }

    public double calculateAverage() {
        int sum = 0;
        for(int m : marks)
            sum += m;
        return (double)sum/marks.length;
    }

    public String calculateGrade() {
        double average = calculateAverage();
        if(average >= 80)
            return "0";
        else if(average >= 60)
            return "A";
        else if(average >= 40)
            return "B";
        else
            return "F";
    }

    public void display() {
        System.out.println("Name of student: " + Name);
        System.out.println("Enrollment Number: " + Enroll);
        System.out.println("Average Marks: " + calculateAverage());
        System.out.println("Grade is: " + calculateGrade());
    }

    public static void main(String[] args) {
        student s1 = new student();
        int marks[] = {50, 60, 70};
        s1.setData("Amit", "BECSU015", marks);
        s1.display();

        int marksObject[] = s1.getMarks();
        System.out.println("Marks are: ");
        for(int m : marksObject)
            System.out.print(m + " ");
    }
}