import java.util.*;
import java.io.*;
public class Game{
  public static void main(String[] args){
    Border.makeBorder();
    System.out.print(">");
    Scanner input = new Scanner(System.in);
    String command = input.nextLine();
    while(!command.equals("q") && !command.equals("quit")){
      if (command.equals("")){
        Text.clear();
        //do i need seeds or like how we redraw
      }
      else {
        Border.makeBorder();
      }
      System.out.print(">");
      command = input.nextLine();
    }
  }
}
