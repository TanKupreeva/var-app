package by.itstep.oop.patterns.factorymethod;

public abstract class Logistics {
    abstract void planDelivery();
    abstract Transport createTransport();

}

class SeaLogistics extends Logistics{

    @Override
    void planDelivery() {
        System.out.println("Sea Delivery plan");
    }

    @Override
    Transport createTransport() {
        return new Ship();
    }
}
class FlyLogistics extends Logistics{

    @Override
    void planDelivery() {
        System.out.println("Fly Delivery plan");

    }

    @Override
    Transport createTransport() {
        return new Plane();
    }
}
class RoadLogistics extends Logistics{

    @Override
    void planDelivery() {
        System.out.println("Road Delivery plan");

    }

    @Override
    Transport createTransport() {
        return new Truck();
    }
}

class LogisticsProvider{
    public static Logistics chooseLogistics(String type){
        switch (type){
            case "AIR":
                return new FlyLogistics();
            case "SEA":
                return  new SeaLogistics();
            case "ROAD":
                return  new RoadLogistics();
            default:
                System.out.println(" Wrong type:"+type);
                return  new RoadLogistics();
        }



    }
}

class LogisticsClient{
    public static void main(String[] args) {
        Logistics logistics = LogisticsProvider.chooseLogistics("AIR");

        logistics.planDelivery();
        logistics.createTransport().deliver();
    }
}