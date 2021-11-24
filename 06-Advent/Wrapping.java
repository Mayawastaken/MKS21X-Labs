import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Wrapping{
  public static int SurfaceWrap(String filename){
    try{
      int needed = 0;
      File file = new File(filename);
      Scanner input = new Scanner(file);
      int sa = 0;
      int maxDim = 0;
      while (input.hasNextLine()){
        String current = input.nextLine();
        String[] split = current.split("x");
        int l = Integer.parseInt(split[0]);
        int w = Integer.parseInt(split[1]);
        int h = Integer.parseInt(split[2]);
        sa = 2*(l*w + l*h + w*h);
        maxDim = Math.max(l,Math.max(w,h));
        sa += (l*w*h)/maxDim;
        needed += sa;
      }
      input.close();
      return needed;
    } catch (FileNotFoundException ex) {
      //File not found
      return 0;

    }
  }

  public static void main(String[] args){
    try{
      String fileWanted = args[0];
      System.out.println(SurfaceWrap(fileWanted));
    } catch (ArrayIndexOutOfBoundsException ex){
      System.out.println("no acceptable file given :(");
    }

  }
// String filename = args[0];

}
