package by.itstep;

public class MathUtil {
    /**
     * Returns a double value with a positive sign,
     * greater than or equal to 0 and less or equal than Max Bound.
     *
     * @param maxBound
     * @return a pseudorandom integer from 0 to maxBound inclusive
     */
    public static int genRandom(int maxBound) {
//int x = (int)(Math.random()*(maxBound+1));
        return genRandom(0, maxBound);
    }

    public static int genRandom(int minBound, int maxBound) {
        //TODO: case when maxBound less than minBound
        int v = maxBound - minBound + 1;
        int x = (int) (Math.random() * v) + minBound;
        return x;
    }

    public static int genRandom() {

        int x = genRandom(10);
        return x;
    }

    public static void varTester(double val) {
        double d;
        d = val;
        System.out.println(d);
        d = d + d;
        System.out.println(d);
    }


    public static void forTester(int num, double val, boolean flag) {
        System.out.println("for Tester begin");
        for (int i = 0; i < num; i++) {
            if (flag) {
                System.out.print("VALUE is " + (val = val + val) + "  ");
            } else {
                System.out.println("VALUE is " + (val = val + val));
            }
        }

        System.out.println("for Tester end");
    }


    public static void task8(){
        for(int a = 0; a < 9; a++){
            int st = (int)(Math.random()*12+1);
            System.out.print(st + " ");
        }
        System.out.println();
    }



    public static void main(String[] args) {
        System.out.println("Main started");
//        varTester(5.55);
//        forTester(5, 10, false);
//        int val = genRandom(10);
//        int val2 = genRandom(100, 101);
//        System.out.println(val);
//        System.out.println(val2);
//        int x = genRandom();
//        System.out.println(x);
        int[] result = ArraysUtil.genRandomArray(20);
        ArraysUtil.printArray(result, true);
        System.out.println("Main end ");
        int max = ArraysUtil.findMax(result);
        System.out.println("Max is " + max);



    }
}
