package by.itstep.oop.model;

public class CoffeeMachine {


    private final double maxWaterTank = 1000;
    private final double maxCoffeTank = 1000;
    private final double maxMilkTank = 500;
    private final double maxgarbageTank = 100;


    private static int salesCounter = 0;
    private String model;
    private int numberOfCups;

    private double waterTank;
    private double coffeeTank;
    private double milkTank;

    private double garbageTank;
    private int currentWaterTemp;

    private boolean isActive = false;
    private boolean isOn = false;

    private void addWater(int extraWater) {
        if ((extraWater + waterTank) >= maxWaterTank) {
            System.out.println("can't add water");
        } else {
            waterTank = waterTank + extraWater;
            System.out.println("current water:" + waterTank + "(ml)");
        }
    }

    private void addCoffee(int extraCoffee) {
        if ((extraCoffee + coffeeTank) >= maxCoffeTank) {
            System.out.println("can't add coffee");
        } else {
            coffeeTank = coffeeTank + extraCoffee;
            System.out.println("current coffee:" + coffeeTank + "(ml)");
        }
    }

    private void addMilk(int extraMilk) {
        if ((extraMilk + milkTank) >= maxMilkTank) {
            System.out.println("can't add milk");
        } else {
            milkTank = milkTank + extraMilk;
            System.out.println("current milk:" + milkTank + "(ml)");
        }
    }

    private void removeGarbageTank() {
        garbageTank = 0;
        System.out.println("Clean");

    }


    public void makeCapuchinno() throws InterruptedException {
        numberOfCups++;
        if (coffeeTank >= 20 && waterTank >= 200 && milkTank >= 100 && garbageTank <= 80) {
            waterTank = waterTank - 200;
            coffeeTank = coffeeTank - 20;
            milkTank = milkTank - 100;
            garbageTank = garbageTank + 10;
            Thread.sleep(1000);
            System.out.println("Capuchinno is maked");
        } else {
            System.out.println("Can't to make capuchinno!");
        }


    }


    public CoffeeMachine(String name) {
        salesCounter++;
        this.model = model;
    }

    public void switchOn() throws InterruptedException {
        if (!isOn) {


            System.out.println("CoffeeMachine" + model + " is starting...");
            Thread.sleep(1000);
            isOn = true;
            System.out.println("CoffeeMachine" + model + " is started!");
        } else {
            System.out.println("Already started!");
        }

    }

    public void switchOff() throws InterruptedException {
        if (isOn) {
            System.out.println("CoffeeMachine" + model + " is stopping...");
            Thread.sleep(1000);
            isOn = false;
            System.out.println("CoffeeMachine" + model + " is stoped!");

        } else {
            System.out.println("Already stopted!");
        }
    }


}