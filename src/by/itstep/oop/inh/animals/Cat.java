package by.itstep.oop.inh.animals;

public class Cat extends DAnimal {
    @Override
    void sleep() {
        super.sleep();
        super.sleep();
        super.sleep();
    }

    @Override
    void eat() {
        System.out.println(getName() + " eat milk");
    }

    @Override
    void play() {
        System.out.println(getName() + " play with mouse");
    }

    @Override
    void voice() {
        System.out.println(getName() + " meow - meow - meow");
    }
}
