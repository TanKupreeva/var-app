package by.itstep.oop.inh.animals;

public class Dog extends DAnimal {

    void sleep() {
        System.out.println(getName() + " is sleeping ...zzzZZZ");
    }
@Override
    void eat() {
        System.out.println(getName() + " eat bone");
    }
@Override
    void play() {
        System.out.println(getName() + " play with ball");
    }
@Override
    void voice() {
        System.out.println(getName() + " gav gav ");
    }

    void serve() {
        System.out.println(getName() + " serve");
    }}



