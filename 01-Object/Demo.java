/* Add to your prior lab/homework directory

Add the Point.java and Demo.java file from class notes.

Write the 3 distance methods. (Static in Demo, Static in point, non-static in point)

Be sure to commit REGULARLY as you go. Commiting once at the end is not acceptable.

Be sure to add test cases to your main and verify the output. */

public class Demo{
  /* more methods can go here*/
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
    Point P6 = new Point(0,-3);
    Point P6 = new Point(-4,0);

    System.out.println(  distance(P1,P2)); //call1
    //System.out.println(  Point.distance(P1,P2)); //call 2
    //System.out.println(  P1.distanceTo(P2)); //call 3
    //This one is IMPLIED strongly. You cannot tell by the calling style alone,
    //but you can make an educated guess.
  }
 }
