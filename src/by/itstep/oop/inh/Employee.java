package by.itstep.oop.inh;

public class Employee extends Person{
    private long salary;

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
public Employee(){
//прежде всего запускается конструктор базового класса, дабы обеспечить инициализацию

    //явный вызов конструктора родительского класса, иначе вызов произойдет неявно
    super();
}
public Employee(int id, String name, String lastname){
        // вызов суперконструктора с параметрами, такой конструктор должен существовать
    super(id, name);
    this.setLastname(lastname);
}

    public Employee(int id, String name, String lastname, char gender, long salary){
        // вызов суперконструктора с параметрами, такой конструктор должен существовать
        super(id, name);
        this.salary = salary;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", lastName='" + getLastname() + '\'' +
                ", gender=" + getGender() +
                ", salary=" + salary +
                '}';
    }
}
