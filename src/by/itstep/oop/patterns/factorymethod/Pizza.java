package by.itstep.oop.patterns.factorymethod;

public abstract class Pizza {

    public abstract void namePizza();

}
    class FourSeasons extends Pizza{

        @Override
        public void namePizza() {
            System.out.println("FourSeasons ");
        }
    }

     class Peperonni extends Pizza{

        @Override
        public void namePizza() {
            System.out.println("Peperonni ");
        }
    }
     class Gavaiskaya extends Pizza{

        @Override
        public void namePizza() {
            System.out.println("Gavaiskaya");
        }
    }



    class Pizzeria {
    public static Pizza makePizza(int key) {
        switch (key) {
            case 1:
                return new FourSeasons();
            case 2:
                return new Peperonni();
            case 3:
                return new Gavaiskaya();
            default:
                throw new IllegalArgumentException("Wrong pizza number");
        }
    }
}



class PizzaClient {
    public static void main(String[] args) {
        Pizza pizza = Pizzeria.makePizza(1);
        pizza.namePizza();

        Pizza[] pizzaArray = {Pizzeria.makePizza(1),
                Pizzeria.makePizza(1), Pizzeria.makePizza(2)};


    }
}


