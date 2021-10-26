public class Demo{
  public static double distance(Point one, Point two){
    double x1 = one.getX();
    double y1 = one.getY();
    double x2 = two.getX();
    double y2 = two.getY();
    return Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));

  }

  public static void main(String[]args){
    Point P1 = new Point(1,1);
    Point P2 = new Point(2,2);
    Point P3 = new Point(0,5);
    Point P4 = new Point(12,0);
    Point P5 = new Point(0,-3);
    Point P6 = new Point(-4,0);

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
  }
 }
