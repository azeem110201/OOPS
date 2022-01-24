import java.util.*;

class Student {
    private String name;
    private Map<String, Double> marks;
    private Scanner scr;
    private String[] subjects = new String[] { "Maths", "Science", "English", "Language", "Social" };

    public Student() {
        this.scr = new Scanner(System.in);
        this.marks = new HashMap<>();
    }

    public void getDetails() {
        System.out.print("Enter the name of the student: ");
        this.name = scr.nextLine();
        for (int i = 0; i < this.subjects.length; i++) {
            System.out.print("Enter the marks in " + this.subjects[i] + ":");
            Double mark = scr.nextDouble();
            this.marks.put(this.subjects[i], mark);
        }
    }

    public double calculatePercentage() {
        double marksGot = 0.0;
        for (Map.Entry<String, Double> entry : this.marks.entrySet()) {
            marksGot += entry.getValue();
        }

        double totalMarks = this.subjects.length * 100;
        return marksGot / totalMarks;
    }

    public void printDetails() {
        System.out.println("Student name is: " + this.name);
        System.out.println("Marks in each subject for the student is as follows..");

        for (Map.Entry<String, Double> entry : this.marks.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}

class LowCohesion {
    public static void main(String[] args) {
        Student student = new Student();
        student.getDetails();
        System.out.println("Percentage: " + student.calculatePercentage());
        student.printDetails();
    }
}