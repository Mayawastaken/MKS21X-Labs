/* Add to your prior lab/homework directory

Add the Point.java and Demo.java file from class notes.

Write the 3 distance methods. (Static in Demo, Static in point, non-static in point)

Be sure to commit REGULARLY as you go. Commiting once at the end is not acceptable.

Be sure to add test cases to your main and verify the output. */

public class Demo{
  /* more methods can go here*/

  public static void main(String[]args){
    Point P1 = new Point(1,1);
    Point P2 = new Point(2,2);

    System.out.println(  distance(P1,P2)); //call1
    System.out.println(  Point.distance(P1,P2)); //call 2
    System.out.println(  P1.distanceTo(P2)); //call 3
    //This one is IMPLIED strongly. You cannot tell by the calling style alone,
    //but you can make an educated guess.
  }
 }
