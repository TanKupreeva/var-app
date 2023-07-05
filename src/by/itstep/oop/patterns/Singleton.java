package by.itstep.oop.patterns;

import java.util.Date;

public class Singleton {
    private static Singleton singleton;
    private String value;

    public String getValue() {
        return value;
    }


    private Singleton() {
        System.out.println(" new Instance created");
    }

    //Lazy implementation. сщздание экземпляра по первому требованию(getInstance) клиента(main)
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
            singleton.value=new Date().toString();
        }
        return singleton;
    }
}

class SingleDemo {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
        System.out.println(singleton.getValue());
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2);

        Singleton singleton3 = Singleton.getInstance();
        System.out.println(singleton3);
        System.out.println(singleton3.getValue());

    }
}
