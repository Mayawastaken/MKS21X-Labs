
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Triangles{
  public static int part1(String filename){
    int counterP1 = 0;
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);
      while (input.hasNextInt()){
        int s1 = input.nextInt();
        int s2 = input.nextInt();
        int s3 = input.nextInt();
        if (((s1 + s2) > s3) && ((s1 + s3) > s2) && ((s3 + s2) > s1)){
          counterP1++;
        }
      }
      input.close();//releases the file from your program
    } catch (FileNotFoundException ex) {
            //File not found
    }
    return counterP1;
  }
  public static void main(String[] args){
    System.out.println("Part I number of triangles: " + part1("Triangles.txt"));
    }
}
//every group of 9 its a loop so like x --> x+3 --> x+6 --> x+1 --> x+4 -->x+7 --> x+2 --> x+5 --> x+8 --> y = x+9 etc
//2d array or arraylist transpose it (flip rows n columns) for part 2
