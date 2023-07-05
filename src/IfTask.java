public class IfTask {
    public static void main(String[] args) {
      boolean flag = true;
      flag = false;
      int age =30, iq =100, cash = 1000;


      boolean isRich = false;
      if (cash>1000) {
          isRich=true;
      }
      boolean isClever = false;
      if (iq >80){
          isClever = true;
      }

      boolean isYoung = false;
      if (age<26) {
          isYoung = true;
      }


      if (isRich || isClever || isYoung ){
          System.out.println("Yes!");
      } else {
          System.out.println("No!");
      }
    }
}
