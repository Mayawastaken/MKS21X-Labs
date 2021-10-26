public class Demo{
  public static double distance(Point one, Point two){
    double x1 = one.getX();
    double y1 = one.getY();
    double x2 = two.getX();
    double y2 = two.getY();
    return Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));

  }

  public static void main(String[]args){
    //strictly Point related (from the previous lab)
    Point P1 = new Point(1,1);
    Point P2 = new Point(2,2);
    Point P3 = new Point(0,5);
    Point P4 = new Point(12,0);
    Point P5 = new Point(0,-3);
    Point P6 = new Point(-4,0);
    Point P7 = new Point(0,0);
    Point P8 = new Point(1,1);
    Point P9 = new Point(2,1);
    Point P10 = new Point(1,2);
    Point P11 = new Point(-2,-3);
    Point P12 = new Point(-2,2);
    Point P13 = new Point(10,-3);


    System.out.println(distance(P1,P2));
    System.out.println(distance(P3,P4));
    System.out.println(distance(P5,P6));
    System.out.println(distance(P6,P5));
    System.out.println(distance(P3,P5));
    System.out.println(" ");
    System.out.println(Point.distance(P1,P2));
    System.out.println(Point.distance(P3,P4));
    System.out.println(Point.distance(P5,P6));
    System.out.println(Point.distance(P6,P5));
    System.out.println(Point.distance(P3,P5));
    System.out.println(" ");
    System.out.println(P1.distanceTo(P2));
    System.out.println(P3.distanceTo(P4));
    System.out.println(P5.distanceTo(P6));
    System.out.println(P6.distanceTo(P5));
    System.out.println(P3.distanceTo(P5));
    System.out.println(" ");

    //Triangle related
    Triangle T1 = new Triangle(P7, P3, P4);
    Triangle T2 = new Triangle(P7, P5, P6);
    Triangle T3 = new Triangle(P8, P9, P10);
    Triangle T4 = new Triangle(P11, P12, P13);
    Triangle T5 = new Triangle(0, 0, 0, 3, 4, 0);
    Triangle T6 = new Triangle(0, 0, -6, 0, 0, -8);
    Triangle T7 = new Triangle(0, 0, 0, 0, 0, 0);


    System.out.println("Triangle stuff:");
    System.out.println(" ");
    System.out.println(T1.getVertex(1));
    System.out.println(T1.getVertex(3));
    System.out.println(T2.getVertex(1));
    System.out.println(T6.getVertex(2));
    System.out.println(" ");
    T7.setVertex(2, P3);
    T7.setVertex(3, P4);
    System.out.println(T7.getVertex(1));
    System.out.println(T7.getVertex(2));
    System.out.println(T7.getVertex(3));
    System.out.println(" ");
    System.out.println(T1.toString());
    System.out.println(T2.toString());
    System.out.println(T3.toString());
    System.out.println(T4.toString());
    System.out.println(T5.toString());
    System.out.println(T6.toString());
    System.out.println(T7.toString());
    System.out.println(" ");
    System.out.println(T1.getPerimeter());
    System.out.println(T2.getPerimeter());
    System.out.println(T3.getPerimeter());
    System.out.println(T4.getPerimeter());
    System.out.println(T5.getPerimeter());
    System.out.println(T6.getPerimeter());
    System.out.println(T7.getPerimeter());
    System.out.println(" ");
  }
 }
