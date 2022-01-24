import java.util.*;

// separating input two classes, one responsible for I/O operation and the other for calculate Percentage
class Console {
    private String name;
    private Map<String, Double> marks;
    private Scanner scr;
    private String[] subjects = new String[] { "Maths", "Science", "English", "Language", "Social" };

    public Console() {
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
        GetMarksDetails get = new GetMarksDetails(this.marks, this.subjects);
        return get.calculatePercentage();
    }

    public void printDetails() {
        System.out.println("Student name is: " + this.name);
        System.out.println("Marks in each subject for the student is as follows..");

        for (Map.Entry<String, Double> entry : this.marks.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}

class GetMarksDetails {
    private Map<String, Double> marks;
    private String[] subjects;

    public GetMarksDetails(Map<String, Double> marks, String[] subjects) {
        this.marks = marks;
        this.subjects = subjects;
    }

    public double calculatePercentage() {
        double marksGot = 0.0;
        for (Map.Entry<String, Double> entry : this.marks.entrySet()) {
            marksGot += entry.getValue();
        }

        double totalMarks = this.subjects.length * 100;
        return marksGot / totalMarks;
    }
}

class HighCohesion {
    public static void main(String[] args) {
        Console console = new Console();
        console.getDetails();
        System.out.println("Percentage is: " + console.calculatePercentage());
        console.printDetails();
    }
}
