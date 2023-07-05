package by.itstep.oop.casting;

public class ShapesTester {

   public static void shapeTest(Shape shape){
      shape.calculateP();
      shape.calculateS();
      shape.print();
      shape.showInfo();
   }





    public static void main(String[] args) {
       Triangle t1 = new Triangle(11, 9, 6);
       t1.setColor("Red");
       t1.calculateP();
       t1.calculateS();
       t1.print();
       t1.showInfo();



       Rectangle re =new Rectangle(5, 4);
       re.setColor("Black");
       re.calculateP();
       re.calculateS();
       re.print();
       re.showInfo();

       Rectangle re2 =new Rectangle(9);
       re.setColor("Blue");
       re.calculateP();
       re.calculateS();
       re.print();
       re.showInfo();

       Circle ci = new Circle(6);
       ci.setColor("Yellow");
       ci.calculateP();
       ci.calculateS();
       ci.print();
       ci.showInfo();

       //casting приведение типов
       //не меняет состояние (поля, функционал)объектов
       //upcasting это когда мы конкретный объект рассматриваем обобщенной ссылкой родительского класса
       Shape sh1= new Triangle(3, 7, 6);
       //явный upcasting (<Super Type>) instance
       Shape sh2 = (Shape) new Rectangle(54);
       //позволяет рассмтри-ть конкретные классы , тем самым функционал более конкретного класса становится недоступным
       //Downcasting это процесс когда мы из общего экземпляра получаем более конкретный
       Shape sh3= new Triangle(5, 7, 11);
       //всегда в явной форме
       Triangle tr2= (Triangle) sh3;
       tr2.setC(9);

       Rectangle rectangle = new Rectangle(7);
       Triangle triangle = new Triangle(4, 5, 8);
       shapeTest((Shape) rectangle);
       shapeTest(triangle);
    }
}
