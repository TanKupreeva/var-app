package by.itstep.strs;

import java.util.Arrays;

public class MutableStringsTest {
    public static void main(String[] args) {
        StringBuffer sBuff;
        StringBuilder sBuild = new StringBuilder();
        sBuild.append("Hello");
        String str = null;
        sBuild.append(str).append(123).append(" World!! ");
        System.out.println(sBuild);

        StringBuilder sBuild2 = new StringBuilder(1024);
        sBuild2.append("Hello world!");
        sBuild2.append("Hello world!");
        sBuild2.append("Hello world!");
        System.out.println(sBuild2);

        StringBuilder sBuild3 = new StringBuilder("1024");
        StringBuilder sBuild4 = new StringBuilder(sBuild.append(sBuild2));
        System.out.println(sBuild4);
        System.out.println(sBuild4.reverse());
        System.out.println("capacity " + sBuild4.capacity());
        System.out.println("length " + sBuild4.length());
        System.out.println("free " + (sBuild4.capacity() - sBuild4.length()));

        String words[] = sBuild4.toString().split(" ");

        System.out.println(Arrays.toString(words));
        HTMLTableBuilder htmlTable = new HTMLTableBuilder();



        htmlTable.addHeaders("ID","NAME", "AVG");
        System.out.println(htmlTable.build());


        htmlTable.addStudents(new Student(1, "Jane", "Di",2,5),
                new Student(2,"Kate","Jo",2,8));

        System.out.println(htmlTable.build());
    }
}
