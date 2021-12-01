import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Non{
  public static boolean vowels3(String str){
    String vowels = "aeiou";
    int num = 0;
    for (int i = 0; i < str.length(); i++){
      if (vowels.indexOf(str.substring(i, i+1)) > -1){
        num++;
      }
      if (num == 3){
        return true;
      }
    }
    return false;
  }

  public static boolean doubles(String str){
    for (int i = 0; i < str.length() - 1; i++){
      if (str.charAt(i) == str.charAt(i+1)){
        return true;
      }
    }
    return false;
  }

  public static boolean withoutStuff(String str){
    for (int i = 0; i < str.length() - 1; i++){
      if (str.substring(i, i+2).equals("ab")){
        return false;
      }
      if (str.substring(i, i+2).equals("cd")){
        return false;
      }
      if (str.substring(i, i+2).equals("pq")){
        return false;
      }
      if (str.substring(i, i+2).equals("xy")){
        return false;
      }
    }
    return true;
  }

  public static int part1(String filename){
    try{
      int needed = 0;
      File file = new File(filename);
      Scanner input = new Scanner(file);
      while (input.hasNext()){
        String current = input.next();
        if (vowels3(current) && doubles(current) && withoutStuff(current)){
          needed++;
        }
      }
      input.close();
      return needed;
    } catch (FileNotFoundException ex) {
      //File not found
      return 0;
    }
  }

  public static boolean pairs(String str){
    String checker = "";
    for (int i = 0; i < str.length() - 1; i++){
      checker = str.substring(i, i+2);
      for (int j = i+2; j < str.length() - 1; j++){
        if (checker.equals(str.substring(j, j+2))){
          return true;
        }
      }
    }
    return false;
  }

  public static boolean sandwich(String str){
    char checker = 'a';
    for (int i = 0; i < str.length() - 2; i++){
      checker = str.charAt(i);
      if (checker == str.charAt(i+2)){
        return true;
      }
    }
    return false;
  }

  public static int part2(String filename){
    try{
      int needed = 0;
      File file = new File(filename);
      Scanner input = new Scanner(file);
      while (input.hasNext()){
        String current = input.next();
        if (pairs(current) && sandwich(current)){
          needed++;
        }
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
      int part = Integer.parseInt(args[1]);
      String fileWanted = args[0];
      if (part == 1){
        System.out.println(part1(fileWanted));
      }
      else {
        System.out.println(part2(fileWanted));
      }
    } catch (ArrayIndexOutOfBoundsException ex){
      System.out.println("no acceptable file given and/or part given :(");
    }
  }

}
