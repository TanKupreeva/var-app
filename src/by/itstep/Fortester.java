package by.itstep;

public class Fortester {

    //0 2 4 6 8 10...(1000 TIMES)
    public static void task1(){
        for(int i = 0; i < 2000; i=i+2){
            System.out.print(i +" ");
        }
        System.out.println();
    }

    //1 3 5 7 ...(500 TIMES)
    public static void task2(){
        for(int i = 1; i < 1000; i=i+2){
            System.out.print(i +" ");
        }
        System.out.println();
    }
    //10 20 30 40 50 ...(50 TIMES)
    public static void task3(){
        for(int i = 0, number = 10; i < 50; i++){
            System.out.print(number +" ");
            number = number + 10;
        }
        System.out.println();
    }

    //-1 -2 -3 -4 -5 ...(100 TIMES)
    public static void task4(){
        for(int i = 0, number = -1; i < 100; i++){
            System.out.print(number +" ");
            number = number  - 1;
        }
        System.out.println();
    }


    //-1 2 -3 4 -5 ...(100 TIMES)
    public static void task5(){
        for(int i = 0, number = -1; i < 100; i++){
            if (number%2==0) {// для четных чисел
                System.out.print(((-1)*number) + " ");
            } else {
                System.out.print(number + " ");
            }
            number--;

        }
        System.out.println();
    }


    public static void task6(){
        for(int i = 0; i < 25; i++){
             int x = (int)(Math.random()*11);
             System.out.print(x + " ");
            }
        System.out.println();
        }


    public static void task7(){
        for (int number =2; number<=9; number++){
        for(int i = 2 ; i < 11; i++){
             int number2 = number *i;
            System.out.println(number +" X "+ i +" = " + number2);
        }
        System.out.println("******");

    }}
    public static void task8(){
        for(int a = 0; a < 9; a++){
            int st = (int)(Math.random()*12+1);
            System.out.print(st + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        //      0        1           3          2
        //for(<var>;<condition>;<iteration>){<body>}
        //<var> - выполняется всего единажды
        //<condition> - true/false
        //<iteration> - выполняется после body, либо перед проверкой condition
//        for(int i = 0; i < 10; i++){
//            System.out.println(i);
//        }
//        for(;true;){
//            System.out.println("Inside for");
//            int x = (int)(Math.random()*10);
//            if (x==5){
//            break;}// выход из цила
//        }

        // %
        int num=3;
        int num2=2;
        int result = num%num2;
        System.out.println(result);
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
}
