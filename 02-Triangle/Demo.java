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


    System.out.println(distance(P1,P2)); // 1.414... = sqrt(2)
    System.out.println(distance(P3,P4)); // 13.0
    System.out.println(distance(P5,P6)); // 5.0
    System.out.println(distance(P6,P5)); // 5.0
    System.out.println(distance(P3,P5)); // 8.0
    System.out.println(" ");
    System.out.println(Point.distance(P1,P2)); // 1.414... = sqrt(2)
    System.out.println(Point.distance(P3,P4)); // 13.0
    System.out.println(Point.distance(P5,P6)); // 5.0
    System.out.println(Point.distance(P6,P5)); // 5.0
    System.out.println(Point.distance(P3,P5)); // 8.0
    System.out.println(" ");
    System.out.println(P1.distanceTo(P2)); // 1.414... = sqrt(2)
    System.out.println(P3.distanceTo(P4)); // 13.0
    System.out.println(P5.distanceTo(P6)); // 5.0
    System.out.println(P6.distanceTo(P5)); // 5.0
    System.out.println(P3.distanceTo(P5)); // 8.0
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
    System.out.println(T1.getVertex(1)); // (0.0, 0.0)
    System.out.println(T1.getVertex(3)); // (12.0, 0.0)
    System.out.println(T2.getVertex(1)); // (0.0, 0.0)
    System.out.println(T6.getVertex(2)); // (-6.0, 0.0)
    System.out.println(" ");
    T7.setVertex(2, P3);
    T7.setVertex(3, P4);
    System.out.println(T7.getVertex(1)); // (0.0, 0.0)
    System.out.println(T7.getVertex(2)); // (0.0, 5.0)
    System.out.println(T7.getVertex(3)); // (12.0, 0.0)
    System.out.println(" ");
    System.out.println(T1.toString()); // {(0.0, 0.0), (0.0, 5.0), (12.0, 0.0)}
    System.out.println(T2.toString()); // {(0.0, 0.0), (0.0, -3.0), (-4.0, 0.0)}
    System.out.println(T3.toString()); // {(1.0, 1.0), (2.0, 1.0), (1.0, 2.0)}
    System.out.println(T4.toString()); // {(-2.0, -3.0), (-2.0, 2.0), (10.0, -3.0)}
    System.out.println(T5.toString()); // {(0.0, 0.0), (0.0, 3.0), (4.0, 0.0)}
    System.out.println(T6.toString()); // {(0.0, 0.0), (-6.0, 0.0), (0.0, -8.0)}
    System.out.println(T7.toString()); // {(0.0, 0.0), (0.0, 5.0), (12.0, 0.0)}
    System.out.println(" ");
    System.out.println(T1.getPerimeter()); // 30.0
    System.out.println(T2.getPerimeter()); // 12.0
    System.out.println(T3.getPerimeter()); // 3.414... = 2 + sqrt(2)
    System.out.println(T4.getPerimeter()); // 30.0
    System.out.println(T5.getPerimeter()); // 12.0
    System.out.println(T6.getPerimeter()); // 24.0
    System.out.println(T7.getPerimeter()); // 30.0
    System.out.println(" ");


    Triangle T8 = new Triangle(1, 1, 1, 4, 4, 1);
    Triangle T9 = new Triangle(0, 0, 3, 0, 1.5, 2.5980762); //side length 3 (2.598... = 1.5sqrt(3))
    Triangle T10 = new Triangle(1, 2, 3, 4, 5, 6); //yes, yes, I know some of these are technically degenerate triangles
    Triangle T11 = new Triangle(1, 2, 3, 4, 5, 6);
    Triangle T12 = new Triangle(.99999993, 2, 3, 4, 5, 6);
    Triangle T13 = new Triangle(3, 4, 5, 6, 1, 2);
    Triangle T14 = new Triangle(0, 0, 0, 0, 0, 0.00000);
    Point P14 = new Point(0,3);
    Point P15 = new Point(0.0000001,3);
    Point P16 = new Point(0,3);
    Point P17 = new Point(1,2);

    System.out.println(P14.equals(P16)); // true
    System.out.println(P10.equals(P17)); // true
    System.out.println(P11.equals(P17)); // false
    System.out.println(P14.equals(P16)); // true
    System.out.println(P14.equals(P15)); // false
    System.out.println(" ");
    System.out.println(T1.equals(T1)); // true
    System.out.println(T10.equals(T11)); // true
    System.out.println(T10.equals(T12)); // true
    System.out.println(T12.equals(T10)); // true
    System.out.println(T10.equals(T13)); // false
    System.out.println(" ");
    System.out.println(T8.classify()); // isosceles
    System.out.println(T9.classify()); // equilateral
    System.out.println(T10.classify()); // isosceles
    System.out.println(T4.classify()); // scalene
    System.out.println(T1.classify()); // scalene
    System.out.println(" ");
    System.out.println(T10.area()); // 0 of course
    System.out.println(T1.area()); // 30.0
    System.out.println(T5.area()); // 6.0
    System.out.println(T2.area()); // 6.0
    System.out.println(T9.area()); // 3.897... = 9sqrt(3)/4
    System.out.println(" ");

    Point Pnull = null;
    Triangle Tnull = null;
    System.out.println(T1.equals(Tnull)); // false
    System.out.println(P1.equals(Pnull)); // false


  }
 }
