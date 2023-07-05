package by.itstep;

public class ArraysUtil {


    public static int[] genRandomArray(int maxSize) {
        int size = MathUtil.genRandom(maxSize);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = MathUtil.genRandom();
        }
        return array;
    }


    public static void printArray(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.println("array[" + index + "]=" + array[index]);

        }
    }

    public static void printArray(int[] array, boolean inLine) {
        if (inLine) {
            System.out.print("array={");

            for (int index = 0; index < array.length; index++) {
                if (index == array.length - 1) {
                    System.out.print(array[index]);
                } else {
                    System.out.print(array[index] + ", ");
                }
            }
            System.out.println("}");
        } else {
            printArray(array);
        }
    }

    public static int findMax(int array[]) {
        int max = Integer.MIN_VALUE;
        for (int index = 0; index < array.length; index++) {
            if (max < array[index]) {
                max = array[index];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr200[] = {33, 123, -88, 15};
        printArray(arr200);
        printArray(arr200, true);
        System.out.println();

        int m = findMax(arr200);
        System.out.println("Max is " + m);
        // Arrays declaration
        //single dimenation
        int arr[];
        int[] arr2;
        double[] dArr;
        boolean[] flags;

        // double dimenation
        int[][] arr3;
        int[] arr4[];
        int arr5[][];

        // multiple dimention
        int[][] arr6[];
        int[][] arr7[][][][][][];
        //0   1
        arr = new int[]{12, 2};
        //            0 1 2
        int[] arr10 = {1, 2, 3};

        //0   1     2   3   4
        int[] arr100 = {30, 44, -123, 5, 5545};
        // 0 1 2 3 4
        //{0,0,0,0,0}
        int[] arr11 = new int[5];
        int[] arr110 = new int[500];// 500 ячеек


        //size
        int arr100Size = arr100.length;
        System.out.println("Number of elements is " + arr100Size);
        System.out.println("Number of elements is " + arr110.length);
        // GET ELEMENT FROM ARRAY
        int val = arr100[2];
        System.out.println("value is " + val);
        int val2 = arr110[499];
        System.out.println("value is " + val2);
        // index
        int array[] = {34, 33, 0, -800, Integer.MAX_VALUE};
        int index = 0;
        System.out.println("First elem:" + array[index]);
        int lastindex = array.length - 1;
        System.out.println("Last elem:" + array[lastindex]);

//        int i = array.length;
//        System.out.println(" elem:" + array[i]);
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(chars[chars.length - 1]);

        // SET ELEMENT
        int[] arr1000 = new int[100];
        arr1000[0] = -100;
        arr1000[1] = Integer.MIN_VALUE;
        arr1000[99] = (int) (Math.random() * 101);
        System.out.println("Last elem is " + arr1000[arr1000.length - 1]);


        int a[] = new int[5];
        a[0] = 22;
        a[1] = 123;
        a[2] = 10;
        a[3] = -99;
        a[4] = 0;
        int[] aCopy = new int[a.length + 3];
        aCopy[0] = a[0];
        aCopy[1] = a[1];
        aCopy[2] = a[2];
        aCopy[3] = a[3];
        aCopy[4] = a[4];
        aCopy[5] = a[0] + a[1] + a[2] + a[3] + a[4];
        aCopy[6] = a[0] * 100;
        aCopy[7] = aCopy.length;
        System.out.println(aCopy[0]);
        System.out.println(aCopy[1]);
        System.out.println(aCopy[2]);
        System.out.println(aCopy[3]);
        System.out.println(aCopy[4]);
        System.out.println(aCopy[5]);
        System.out.println(aCopy[6]);
        System.out.println(aCopy[7]);


    }
}

