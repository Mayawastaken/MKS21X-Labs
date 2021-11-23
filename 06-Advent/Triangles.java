
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

  public static int part2(String filename){
    int counterP2 = 0;
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);
      while (input.hasNextInt()){
        int a1 = input.nextInt();
        int b1 = input.nextInt();
        int c1 = input.nextInt();
        int a2 = input.nextInt();
        int b2 = input.nextInt();
        int c2 = input.nextInt();
        int a3 = input.nextInt();
        int b3 = input.nextInt();
        int c3 = input.nextInt();
        if (((a1 + a2) > a3) && ((a1 + a3) > a2) && ((a3 + a2) > a1)){
          counterP2++;
        }
        if (((b1 + b2) > b3) && ((b1 + b3) > b2) && ((b3 + b2) > b1)){
          counterP2++;
        }
        if (((c1 + c2) > c3) && ((c1 + c3) > c2) && ((c3 + c2) > c1)){
          counterP2++;
        }
      }
      input.close();//releases the file from your program
    } catch (FileNotFoundException ex) {
            //File not found
    }
    return counterP2;
  }

  public static void main(String[] args){
    System.out.println("Part I number of triangles: " + part1("Triangles.txt"));
    System.out.println("Part II number of triangles: " + part2("Triangles.txt"));
    }
}
