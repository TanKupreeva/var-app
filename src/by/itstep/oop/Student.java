package by.itstep.oop;

public class Student {
    private String name;
    private double avg;
    // has a relationship  есть отношение (у студента есть университет)
    private University university;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }


}

class University {
    private String name;
    private String location;
    private int numberofStudents;

    //has a relationship
    private Teacher[] teachers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberofStudents() {
        return numberofStudents;
    }

    public void setNumberofStudents(int numberofStudents) {
        this.numberofStudents = numberofStudents;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }
}

class Teacher {
    private String name;
    private int exp;
    private long salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}


class Test{
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("John");
        t1.setSalary(2000);
        t1.setExp(5);


        Teacher t2 = new Teacher();
        t2.setName("Mike");
        t2.setSalary(3500);
        t2.setExp(7);


        Teacher[] teachers={t1,t2};

        University university=new University();
        university.setName("BSUIR");
        university.setLocation("BLR, P.Brovki 123");
        university.setNumberofStudents(1500);
        university.setTeachers(teachers);


        Student s1 = new Student();
        s1.setName("Ivanov Ivan");
        s1.setAvg(10);
        s1.setUniversity(university);
    }
}