package by.itstep.oop.casting;

public abstract class JavaProgrammer {
    abstract void makeCode();

    public void playTennis() {
        System.out.println("Playing tennis....");
    }
}

class MiddleJavaProgrammer extends JavaProgrammer {

    @Override
    void makeCode() {
        System.out.println("Write some good code here.");
        playTennis();
    }


}

class SeniorJavaDeveloper extends JavaProgrammer {

    @Override
    void makeCode() {
        System.out.println("Write some perfect code here.");
        playTennis();
    }


    void leaveOffice() {
        System.out.println("leave office");
    }
}

class JuniorJavaProgrammer extends JavaProgrammer {

    @Override
    void makeCode() {
        System.out.println("Write some bad code here.");
    }

    void learn(){
        System.out.println("study");
    }
}

class Company{
    public static void main(String[] args) {
        JuniorJavaProgrammer junior = new JuniorJavaProgrammer();
        JavaProgrammer programmer = (JavaProgrammer) junior; //явный upcasting
        Object o = (Object) new SeniorJavaDeveloper();
        Object o2 = (JavaProgrammer)new MiddleJavaProgrammer();

    }
}