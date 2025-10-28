package codes;

public class Student {
    private String name;
    private int roll;
    private int marks;

    public Student(String name, int roll, int marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    public String getName() { return name; }
    public int getRoll() { return roll; }
    public int getMarks() { return marks; }
}
