package by.itstep.oop.casting;

public class Circle extends Shape {
    public double getR() {
        return r;
    }

    public Circle(double r) {
        this.r = r;
    }

    public void setR(double r) {
        this.r = r;
    }

    private double r;

    @Override
    public void print() {
        System.out.println("o");
    }

    @Override
    public void calculateP() {
double p=2*Math.PI*r;
setP(p);
    }

    @Override
    public void calculateS() {
double s = Math.PI*r*r;
setS(s);
    }
}
