package by.itstep.oop;

public class Cat {
    private String name;
    private String type;
    private int age;
    private String color;
    private char gender;
    private boolean hasOwner;

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;

    }

    public void setType(String newType) {
        type = newType;
    }

    public String getType() {
        return type;
    }

    public void setAge(int newAge){
        age = newAge;
    }
    public int getAge(){
        return age;
    }


    public boolean isHasOwner() {
        return hasOwner;
    }

    public void setHasOwner(boolean newHasOwner) {
        hasOwner = newHasOwner;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String newColor){
        color = newColor;
    }

    public void setGender(char newGender){
        gender = newGender;
    }
    public char getGender(){
        return gender;
    }


    void sleep(){
        System.out.println(name + " is sleeping");
    }

    void play(){
        System.out.println(name +" is playing");
    }







}
 class CatTester{
     public static void main(String[] args) {
        Cat cat =new Cat();
        cat.setName("Murzic");
        System.out.println("Name is "+cat.getName());
         cat.sleep();
     }
 }