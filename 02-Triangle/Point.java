public class Point{
  private double x,y;
  public Point(double X, double Y){
    x=X;
    y=Y;
  }
  public Point(Point p){
    x= p.x;
    y= p.y;
  }
  public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }

  public static double distance(Point one, Point two){
    double x1 = one.getX();
    double y1 = one.getY();
    double x2 = two.getX();
    double y2 = two.getY();
    return Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
  }

  public double distanceTo(Point two){
    double x1 = x;
    double y1 = y;
    double x2 = two.getX();
    double y2 = two.getY();
    return Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
  }

  public String toString(){
    return "(" + x + ", " + y + ")";
  }

  public static boolean closeEnough(double a, double b){
    if (a == 0 && b == 0) {
      return true;
    }
    else if (a == 0 || b == 0) {
      return false;
    }
    return (Math.abs((a - b)/a * 100) <= .001);
  }

  public boolean equals(Point other){
    if (other == null) {
      return false;
    }
    return (closeEnough(x, other.getX()) && closeEnough(y, other.getY()));
  }

}
