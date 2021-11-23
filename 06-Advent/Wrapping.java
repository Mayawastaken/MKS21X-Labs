import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Wrapping{
  public static int SurfaceWrap(String filename, int l, int w, int h){

    File file = new File(filename);
    Scanner input = new Scanner(file);
    int sa = 0;
    int maxDim = 0;
    while (input.hasNextLine()){
      String current = input.nextLine();
      String[] split = current.split("x");
      sa = 2*(l*w + l*h + w*h);
      maxDim = Math.max(l,Math.max(w,h));
      sa += (l*w*h)/maxDim;
    }
    input.close();

  }

// String filename = args[0];

}
