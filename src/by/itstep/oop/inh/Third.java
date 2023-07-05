package by.itstep.oop.inh;

public class Third extends Child{
    public long id;

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void run(){
        System.out.println(getName()+ " is running.....");
    }
}
