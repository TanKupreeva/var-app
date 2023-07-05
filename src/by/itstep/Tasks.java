package by.itstep;

import java.util.Scanner;

public class Tasks {
    public static void task1() {
        System.out.println("Begin method body");
        System.out.println("Logic is here...");
        System.out.println("End of method.");
    }

    public static void main(String[] args) {
        System.out.println("Begin main.");
        System.out.println("Main method logic.");
        runSomeTask();//запускаем метод
        System.out.println("Main END.");

    }

    public static void task2() {
        System.out.println("Task 2 begin.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a=");
        int a = sc.nextInt();
        System.out.println("Input b=");
        int b = sc.nextInt();
        System.out.println("Input c=");
        int c = sc.nextInt();
        System.out.println(a + "x^2+" + b + "x+" + c + "=0");
        int d = b * b - 4 * a * c;
        System.out.println("d=" + d);
        if (d < 0) {
            System.out.println("нет корней");
        } else if (d == 0) {
            double x1 = (-b / (2 * a));
            System.out.println("x=" + x1);
        }
        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("x1=" + x1);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("x2=" + x2);
        }

    }

    public static void triangleInfo() {
        System.out.println("Задача треугольник ");
        System.out.println("Input a=");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Input b=");
        int b = sc.nextInt();
        System.out.println("Input c=");
        int c = sc.nextInt();
        if ((a + b) > c && (b + c) > a && (a + c) > b) {
            int p = a + b + c;
            System.out.println("Периметр =" + p);
            double pp = p / 2.0;
            System.out.println("Площадь = " + Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c)));

        } else {
            System.out.println("Треугольника не существует");
        }
        if (a == b && b == c && a == c) {
            System.out.println("Треугольник равносторонний");
        } else if (
                (Math.pow(a, 2) + Math.pow(b, 2)
                        == Math.pow(c, 2)) || (Math.pow(c, 2) +
                        Math.pow(b, 2) == Math.pow(a, 2))
                        || (Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2))) {
            System.out.println("Треугольник прямоугольный");
        } else if (a == b || b == c || a == c) {
            System.out.println("Треугольник равнобедренный");
        }

    }

    public static void rectangleInfo() {
        System.out.println("Задача четырехугольник ");
        System.out.println("Input a=");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Input b=");
        int b = sc.nextInt();
        System.out.println("Input c=");
        int c = sc.nextInt();
        System.out.println("Input d=");
        int d = sc.nextInt();
        if (a == b && b == c && c == d && d == a) {
            System.out.println("Это квадрат");
            System.out.println("Площадь =" + a * a);
            System.out.println("Периметр=" + 4*a);
        }

    }

    public static void runSomeTask() {
        System.out.println("1. task1()");
        System.out.println("2. task2");
        System.out.println("3. triangleInfo");
        System.out.println("4. rectangleInfo");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Iyem number:");
        int num = sc.nextInt();

        if (num == 1) {
            task1();
        } else if (num == 2) {
            task2();
        } else if (num == 3) {
            triangleInfo();
        } else if (num == 4) {
            rectangleInfo();
        } else {
            System.out.println("Not such metod");

        }
    }
}

