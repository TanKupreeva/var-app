package by.itstep;

import java.util.Scanner;

public class WhileTester {
    public static void main(String[] args) throws InterruptedException {
        int t = 23;

        System.out.println("How much water(ml? max 5000)?");
        Scanner sc = new Scanner(System.in);
        int ml = sc.nextInt();
        if (ml >= 200 && ml <= 5000) {
            final int max = 100;//const
            while (t <= max) {
                System.out.println("working...");
                Thread.sleep(500 * ml / 5000);

                int x = (int) (Math.random() * 6) + 5; // from 5 to 10
                t += x;//t=t+x;
                System.out.println("Current tmp is " + t);
            }
        } else {
            System.out.println("Please add more water. Min is 200ML. MAX 5L");
        }

//        task1();
//        task2();
//        task3();
        task8();
    }


    //0 2 4 6 8 10...(1000 TIMES)
    public static void task1() {
        //        for (int i = 0; i < 2000; i = i + 2) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
        int i=0;
        while (i<2000){
            System.out.println(i);
            i=i+2;
        }
    }

    //1 3 5 7 ...(500 TIMES)
    public static void task2() {
//        for (int i = 1; i < 1000; i = i + 2) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
        int i =1;
        while (i<1000){
            System.out.println(i);
            i=i+2;
        }
    }

    //10 20 30 40 50 ...(50 TIMES)
    public static void task3() {
//        for (int i = 0, number = 10; i < 50; i++) {
//            System.out.print(number + " ");
//            number = number + 10;
//        }
//        System.out.println();
        int i=0, num=10;
        while (i<50){
            System.out.println(num);
            num = num+10;
            i++;
        }}
        public static void task8(){
//            for(int a = 0; a < 9; a++){
//                int st = (int)(Math.random()*12+1);
//                System.out.print(st + " ");
//            }
//            System.out.println();
            int a=0;
            while (a<10){
                int st = (int)(Math.random()*13+1);
                System.out.print(st + " ");
                a=a+1;

            }
        }

    }
