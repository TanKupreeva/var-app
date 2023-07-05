package by.itstep.oop;

//Class <=> Model <=> Type <=> Template.определяет будущие хар-ки и функционал конкретных объектов
public class Person {
    //field - поля. Хар-ки будущего объекта
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
    String lastName; //
    char gender;// can be 'f', 'm'
    boolean isSingle;

    //methods <=> function поведение будущих объектов
    void sayMyname() {
        System.out.println("Hello, my, name is " + name);
    }

    void dance() {
        System.out.println(name + " is dancing");
    }

    void drink() {
        if (age >= 18) {
            System.out.println("Vine or/and Beer");
        } else {
            System.out.println("Water, only water");
        }
    }

    void eat() {
        System.out.println(name + " is eating");
    }

    void job() {
        System.out.println(name + " has a job");
    }
}

class Tester {
    public static void main(String[] args) {
        int num;
        //создание (декларирование) переменной типа person
        Person person;
        //инициализация instance creation <=> object creation. С пом оператора new создаем объект в памяти
        person = new Person();
        //instance fields initialization <=> object populating
        person.name = "John";
        person.age = 32;
        person.gender = 'm';
        person.isSingle = true;
        person.lastName = "Johnson";

        //object behavior <=> methods invocation
        person.sayMyname();
        person.drink();
        person.dance();
        System.out.println("***********************");

        Person person2 = new Person();
        person2.name = "Ann";
        person2.age = 45;
        person2.gender = 'f';
        person2.isSingle = true;
        person2.lastName = "Johnson";

        person2.sayMyname();
        person2.drink();
        person2.drink();
        person2.drink();
        person2.dance();
        person2.job();
        System.out.println("***********************");

        Person person3 = new Person();
        person3.name = "Sam";
        person3.age = 17;
        person3.gender = 'f';
        person3.isSingle = true;
        person3.lastName = "Johnson";

        person3.sayMyname();
        person3.drink();
        person3.eat();


    }
}