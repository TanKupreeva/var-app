package by.itstep.oop.casting;

public class Rectangle extends Shape {

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    private double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    /**
     * Square case
     * @param a side
     */
    public Rectangle(double a) {
        this.a = a;
        this.b = a;
    }
    @Override
    public void print() {
        System.out.println(" ___");
        System.out.println("|   |");
        System.out.println(" ---");
    }

    @Override
    public void calculateP() {

        setP((a + b) * 2);
    }

    @Override
    public void calculateS() {
        double s = a * b;
        setS(s);
    }
}
