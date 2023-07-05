package by.itstep;

import java.util.Scanner;

public class SwitchTester {
    public static void main(String[] args) {
        //task1();
        task2();
        //task();
    }

        public static void task() {
            int num = 1;
            // switch (var){body with cases}
            switch (num) {
                case 1:
                    System.out.println("One");

                case 2:
                    System.out.println("Two");
                    break;
                default:
                    System.out.println("Not ONE and not TWO!");
                    break;
            }

            System.out.println("Введите номер дня недели");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Monday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Not");
                    break;
            }


            System.out.println("Введите номер месяца");

            int m = sc.nextInt();
            switch (m) {
                case 1:
                    System.out.println("Январь");
                    break;
                case 2:
                    System.out.println("Февраль");
                    break;
                case 3:
                    System.out.println("Март");
                    break;
                case 4:
                    System.out.println("Апрель");
                    break;
                case 5:
                    System.out.println("Май");
                    break;
                case 6:
                    System.out.println("Июнь");
                    break;
                case 7:
                    System.out.println("Июль");
                    break;
                case 8:
                    System.out.println("Август");
                    break;
                case 9:
                    System.out.println("Сентябрь");
                    break;
                case 10:
                    System.out.println("Октябрь");
                    break;
                case 11:
                    System.out.println("Ноябрь");
                    break;
                case 12:
                    System.out.println("Декабрь");
                    break;
                default:
                    System.out.println("Not");
                    break;
            }
        }

    public static void task1() {
        System.out.println("Input month num");
        Scanner sc = new Scanner(System.in);
        int monthNum = sc.nextInt();
        switch (monthNum) {
            case 12:
            case 1:
                case2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("incorrect month");

        }
    }

    public static void task2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input letter (single):");
        char ch = sc.next().charAt(0);
        int code = (int) ch;//код символов
        System.out.println("Code is " + code);
        if (Character.isLetter(ch)){//((code >=65 && code<=90)||(code>=97 && code<=122))
            System.out.println("letter");
            switch (Character.toLowerCase(ch)){
                case 'a':
                case 'i':
                case 'e':
                case 'y':
                case 'o':
                case 'u':
//                case 'A':
//                case 'I':
//                case 'E':
//                case 'Y':
//                case 'O':
//                case 'U':
                    System.out.println("vowel");
                    break;
                default:
                    System.out.println("consonant");
            }
        }else {
            System.out.println("Your input is not a letter. Please input letter");


            }

        }

    }


