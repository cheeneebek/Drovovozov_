package Prack_work_10;

public class Student {
    private String firstName;
    private String lastName;
    private String specialty;
    private int course;
    private String group;
    private double gpa;

    public Student(String firstName, String lastName, String specialty,
                   int course, String group, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
        this.course = course;
        this.group = group;
        this.gpa = gpa;
    }

    // Геттеры
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getSpecialty() { return specialty; }
    public int getCourse() { return course; }
    public String getGroup() { return group; }
    public double getGpa() { return gpa; }

    // Сеттеры
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setSpecialty(String specialty) { this.specialty = specialty; }
    public void setCourse(int course) { this.course = course; }
    public void setGroup(String group) { this.group = group; }
    public void setGpa(double gpa) { this.gpa = gpa; }

    @Override
    public String toString() {
        return String.format("%-10s %-10s %-15s %-2d %-6s %.2f",
                firstName, lastName, specialty, course, group, gpa);
    }
}