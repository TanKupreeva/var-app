package by.itstep;

public class IfTester {

    public static void main(String[] args) {
        System.out.println("Begin");
        int t = -30;
        //if(<condition>) {<body>}, where condition can be TRUE or FALSE!
        // if condition is TRUE -> BODY
        if (t>20) {
            System.out.println("Майка");
        }
        if(t<-15){
            System.out.println("Шуба");
        }


        int m1 = 10, m2 = 8, m3 = 10, m4 = 9, m5 = 10;
        double avg = (m1 + m2 + m3 + m4 + m5)/5.0;
        System.out.println("AVG" + avg);
        if (avg>=9) {
            System.out.println("=)");
        } else if (avg >= 6) {
            System.out.println("=|");
        }else {
            System.out.println("=(");
            }

        int a = 7, b = 5, c = 3;
        if ( (a + b)<=c) {
            System.out.println("Invalid triangle");
        }else if ((b + c)<=a) {
            System.out.println("Invalid triangle");
            }else if ((a + c)<=b) {
            System.out.println("Invalid triangle");
        } else {
            System.out.println("Correct triangle");
        }

        int x = 1, y = 2;
        if (x>y) {
            System.out.println("x>y");
        } else if (x<y){
            System.out.println("x<y");
        } else {
            System.out.println("x=y");
        }

        int min, x1 = -1, y1 = 2, z1 =3;
        //int min = x1; второй вариант
        if (x1>y1) {
            min=y1;
        } else {min = x1;}
        if (min<z1){
            System.out.println("min=" + min);
        } else {
            min = z1;
            System.out.println("min=" + min);
        }






        System.out.println("End.");
    }
}
