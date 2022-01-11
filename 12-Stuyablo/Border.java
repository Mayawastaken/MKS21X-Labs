public class Border{
  public static void main(String[] args){
    Text.hideCursor();
    Text.clear();
    Text.go(1,1);
    for (int i = 1; i < 80; i++){
      System.out.print(Text.colorize("*",Text.MAGENTA));
    }
    for (int i = 1; i < 30; i++){ //um check if its 30x80 and not smth else0
      System.out.print(Text.colorize("*",Text.MAGENTA));
      Text.go(i,80);
    }
    for (int i = 80; i > 0; i--){ //um check if its 30x80 and not smth else0
      System.out.print(Text.colorize("*",Text.MAGENTA));
      Text.go(30,i);
    }
    for (int i = 30; i > 0; i--){ //um check if its 30x80 and not smth else0
      System.out.print(Text.colorize("*",Text.MAGENTA));
      Text.go(i,1);
    }
    Text.go(31,1); //get terminal back down
  }

}
