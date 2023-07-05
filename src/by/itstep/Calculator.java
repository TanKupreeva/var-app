//package by.itstep;
//
//import java.util.Scanner;
//
//public class Calculator {
//    public static void printSumma(int a, int b) {
//
//        System.out.println("S = " + summa(a, b));
//    }
//
//    public static int summa(int a, int b) {
//        int result = a + b;
//        return result;
//    }
//
//    //    public static void printX2(int a){
////        System.out.println("Result is "+ 2*a);
////    }
//    public static int sub(int a, int b) {
//        //int result = a - b;
//        return a - b;
//    }
//
//
//    public static double div(double a, double b) {
//        if (b == 0) {
//            throw new IllegalArgumentException("Div by Zero");// покидаем div
//        }
//        double result = a / b;
//        return result;
//    }
//
//    public static int mult(int a, int b) {
//        int result = a * b;
//        return result;
//    }
//
//    public static int squareRoot(int base) {
//        int result = (int) Math.sqrt(base);
//        return result;
//    }
//
//    public static int rast(int v, int t) {
//        int result = v * t;
//        return result;
//    }
//
//    public static double gip(int a, int b) {
//        // int c = squareRoot(summa(mult(3, 4),mult(4,4)));
//        double c = squareRoot(summa(mult(a, a), mult(b, b)));
//        return c;
//    }
//
//
//    public static void menu() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("1. Summa");
//        System.out.println("2. Multiplication");
//        System.out.println("3. Sub");
//        System.out.println("4. Div");
//        System.out.println("5. SquareRoot");
//
//
//        int methodNumber = sc.nextInt();
//        switch (methodNumber) {
//            case 1: {
//                System.out.println("Input a:");
//                int a = sc.nextInt();
//                System.out.println("Input b:");
//                int b = sc.nextInt();
//                int r = summa(a, b);
//                System.out.println("Result is " + r);
//                break;
//            }
//            case 2: {
//                System.out.println("Input a:");
//                int a = sc.nextInt();
//                System.out.println("Input b:");
//                int b = sc.nextInt();
//                int r = mult(a, b);
//                System.out.println("Result is " + r);
//                break;
//            }
//            case 3: {
//                System.out.println("Input a:");
//                int a = sc.nextInt();
//                System.out.println("Input b:");
//                int b = sc.nextInt();
//                int r = sub(a, b);
//                System.out.println("Result is " + r);
//                break;
//            }
//            case 4: {
//                System.out.println("Input a:");
//                int a = sc.nextInt();
//                System.out.println("Input b:");
//                int b = sc.nextInt();
//                double r = div(a, b);
//                System.out.println("Result is " + r);
//                break;
//            }
//            case 5: {
//                System.out.println("Input a:");
//                int a = sc.nextInt();
//                int r = squareRoot(a);
//                System.out.println("Result is " + r);
//                break;
//            }
//
//            default: {
//                System.out.println("Incorrect number");
//                System.out.println("1 - Повторить ");
//                System.out.println("2 - Закончить ");
//                int methodNumber1 = sc.nextInt();
//                switch (methodNumber1){
//                    case 1:{
//                        menu();
//                    }
//                    case 2:{
//                        break;
//                    }
//            }
//        }
//
//    }}
//    public static void game(int times) {
//        if (times < 1) {
//            System.out.println("Wrong times number!");
//        } else {
//            Scanner sc = new Scanner(System.in);
//            for (int i = 0; i < times; i++) {
//                int mNum = (int) Math.random() * 5 + 1;
//                switch (mNum) {
//                    case 1: {
//                        System.out.println("Input a:");
//                        int a = sc.nextInt();
//                        System.out.println("Input b:");
//                        int b = sc.nextInt();
//                        int r = summa(a, b);
//                        System.out.println("Result is " + r);
//                        break;
//                    }
//                    case 2: {
//                        System.out.println("Input a:");
//                        int a = sc.nextInt();
//                        System.out.println("Input b:");
//                        int b = sc.nextInt();
//                        int r = mult(a, b);
//                        System.out.println("Result is " + r);
//                        break;
//                    }
//                    case 3: {
//                        System.out.println("Input a:");
//                        int a = sc.nextInt();
//                        System.out.println("Input b:");
//                        int b = sc.nextInt();
//                        int r = sub(a, b);
//                        System.out.println("Result is " + r);
//                        break;
//                    }
//                    case 4: {
//                        System.out.println("Input a:");
//                        int a = sc.nextInt();
//                        System.out.println("Input b:");
//                        int b = sc.nextInt();
//                        double r = div(a, b);
//                        System.out.println("Result is " + r);
//                        break;
//                    }
//                    case 5: {
//                        System.out.println("Input a:");
//                        int a = sc.nextInt();
//                        int r = squareRoot(a);
//                        System.out.println("Result is " + r);
//                        break;
//                    }
//
//                    default: {
//                        System.out.println("Incorrect number");
//                    }
//
//                }
//            }
//
//
//        }
//
//
//        //Client
//       // public static void main (String[]args){
//
////game(1);
//
////        printSumma(10, -60);
////        int s = summa(10, 20);
////        System.out.println(s);
////
////        int r = sub(200, 400);
////        System.out.println("Sub result is " + r);
////
////        double d = div(5, 2);
////        System.out.println("Div result is " + d);
////
////      int m = mult(10, 4);
////       System.out.println("Mult result is " + m);
////
////        System.out.println(sub(sub(2,2),summa(4,4)));
////
////
////        System.out.println(squareRoot(9));
////        System.out.println(rast(60, 2));
////       System.out.println(gip(3,4));
//
//
////        }
////
////    }}
