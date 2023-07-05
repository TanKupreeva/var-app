package by.itstep.oop.inh.task;

public class SuperClient extends Client{
    private String function;

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }
public SuperClient(){
       // super();
      //  this.setRole("Admin");
    super(0, null, null, null, null, "Admin");
}

}
