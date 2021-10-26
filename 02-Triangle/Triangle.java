public class Triangle {
  private Point v1, v2, v3;

  public Triangle(Point x, Point y, Point z){
    v1 = x;
    v2 = y;
    v3 = z;
  }

  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
    Point x = new Point(x1, y1);
    Point y = new Point(x2, y2);
    Point z = new Point(x3, y3);
    v1 = x;
    v2 = y;
    v3 = z;

  }
  public Triangle(Triangle t){
    v1 = t.v1;
    v2 = t.v2;
    v3 = t.v3;
  }

  public Point getVertex(int i){
    if (i == 1){
      return v1;
    }
    if (i == 2){
      return v2;
    }
    if (i == 3){
      return v3;
    }
    return v1;
  }

  public void setVertex(int i, Point p){
    if (i == 1){
      v1 = p;
    }
    if (i == 2){
      v2 = p;
    }
    if (i == 3){
      v3 = p;
    }
  }

  public String toString(){
    String pt1 = v1.toString();
    String pt2 = v2.toString();
    String pt3 = v3.toString();
    return "{" + pt1 + ", " + pt2 + ", " + pt3 + "}";
  }

  public double getPerimeter(){
    double d1 = v1.distanceTo(v2);
    double d2 = v1.distanceTo(v3);
    double d3 = v2.distanceTo(v3);
    return d1 + d2 + d3;
  }

  public static boolean closeEnough(double a, double b){
    return (((Math.abs(a - b)/a) * 100) <= .001);
  }
}
