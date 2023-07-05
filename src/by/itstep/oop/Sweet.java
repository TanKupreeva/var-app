package by.itstep.oop;

public class Sweet {
    private String name;
    private String manufacturer;
    private String type;
    private int weight;

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }
    public void setManufacturer(String newManufacturer) {
        manufacturer = newManufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setType(String newType) {
        type = newType;
    }

    public String getType() {
        return type;
    }

    public void setWeight(int newWeight) {
        weight = newWeight;
    }

    public int getWeight() {
        return weight;
    }

    void eat(){

    }


}
class SweetsTester{
    public static void main(String[] args) {
        Sweet sweet =new Sweet();
        sweet.setName("Stolichnie");
        System.out.println("Sweet is "+ sweet.getName());

        sweet.setManufacturer("Komunarca");
        System.out.println("Manufacture is "+ sweet.getManufacturer());

        sweet.setType("chocolate");
        System.out.println(sweet.getName()+" is "+ sweet.getType());
        System.out.println();

        Sweet sweet1 =new Sweet();
        sweet1.setName("Mishka na polyane");
        System.out.println("Sweet is "+ sweet1.getName());

        sweet1.setManufacturer("Komunarca");
        System.out.println("Manufacture is "+ sweet1.getManufacturer());

        sweet1.setType("chocolate");
        System.out.println(sweet1.getName()+" is "+ sweet1.getType());

        Sweet sweet2 =new Sweet();
        sweet2.setName("Spartak");
        System.out.println("Sweet is "+ sweet2.getName());

        sweet2.setManufacturer("Spartak");
        System.out.println("Manufacture is "+ sweet2.getManufacturer());

        sweet1.setType("chocolate");
        System.out.println(sweet2.getName()+" is "+ sweet1.getType());
    }
}