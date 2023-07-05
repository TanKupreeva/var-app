package by.itstep.oop.casting;

//описать базовые поля и функциию Создать экземпляр или объект типа Shape невозможно. В абстрактном классе м б абстрактные ф и конкретные
public abstract class Shape {
    private double s;
    private double p;
    private String color;

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    //абстрактные методы дикларируюся для реализации наследников

    public abstract void print();

    public void showInfo() {
        System.out.println("Shape: S = " + s + ", P = " + p + ", Color is " + color);
    }

    public abstract void calculateP();
    public abstract void calculateS();


}
