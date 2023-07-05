package by.itstep.oop.inh;

import by.itstep.oop.Cat;

// 'IS - A' relationship. когда наследник есть родитель
// класс child расширяет (наследует) parents
public class Child extends Parent {
    //'HAS - A' relationship
    private Cat cat;
    private int iq;

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public void jump() {
        System.out.println("jamping " + getName());
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }
// переопределение перекрытие способность изменить функционал который был в базовом классе
  @Override
    public void sayMyName() {
        // super  это ссылка на суперкласс
        super.sayMyName();
        System.out.println("My name is " + getName());
    }
}
