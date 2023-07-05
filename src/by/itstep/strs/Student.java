package by.itstep.strs;

public class Student {
    private int id;
    private String name;
    private String lastname;
    private int courseNum;
    private double avg;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(int courseNum) {
        this.courseNum = courseNum;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public Student(int id, String name, String lastname, int courseNum, double avg) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.courseNum = courseNum;
        this.avg = avg;
    }

    public Student() {
    }
}
