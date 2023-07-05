package by.itstep.oop.inh.animals;

import by.itstep.oop.Person;

public class Test {
    public static void main(String[] args) {

        Tiger tiger = new Tiger();
        tiger.setName("Tiger");
        tiger.attack();
        tiger.eat();
        tiger.play();
        tiger.sleep();
        tiger.voice();
        Cat c1 = new Cat();
        c1.setName("Barsic");
        c1.eat();
        c1.play();
        c1.sleep();
        c1.voice();


        Cat c2 = new Cat();
        c2.setName("Murzic");
        c2.voice();
        Dog d1=new Dog();
        d1.setName("Barbos");
        d1.eat();
        d1.voice();
        d1.play();
        d1.sleep();
        Fish fish = new Fish();
        Person person = new Person();
        person.setName("John");
        tiger.setOwner(person);
    }
}
