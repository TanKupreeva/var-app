package by.itstep.oop.inh;

public class Student extends Person {
    private double avg;

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", lastName='" + getLastname() + '\'' +
                ", gender=" + getGender() +
                ", avg=" + avg +
                '}';
    }

    public Student(int id, String name, String lastname, char gender, double avg) {
        super(id, name, lastname, gender);
        this.avg = avg;
    }


}
