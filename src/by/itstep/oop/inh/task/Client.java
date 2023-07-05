package by.itstep.oop.inh.task;

public class Client {

    private int id;
    private String name;
    private String eMail;
    private String password;
    private String password2;
    private String role;

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

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", eMail='" + eMail + '\'' +
                ", password='********'" +
                ", role='" + role + '\'' +
                '}';
    }


    public Client() {
        this.role = "user";
    }

    public Client(int id, String name, String eMail, String password, String password2, String role) {
        this.id = id;
        this.name = name;
        this.eMail = eMail;
        this.password = password;
        this.password2 = password2;
        this.role = role;
    }

    public Client(int id, String name, String eMail) {
//        this.id = id;
//        this.name = name;
//        this.eMail = eMail;
        this(id, name, eMail, null, null, null);
    }
}
