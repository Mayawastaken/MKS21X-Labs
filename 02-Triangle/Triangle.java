public class Triangle {
  private Point v1, v2, v3;

  public Triangle(Point x, Point y, Point z){
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
}
