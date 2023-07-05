package by.itstep.swing.films;

public class Actor {
    private long id;
    private String name;
    //TODO


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Actor() {
    }

    public Actor(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public Actor(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
