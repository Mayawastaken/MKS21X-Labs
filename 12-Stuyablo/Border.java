public class Border{
  public static void main(String[] args){
    Text.hideCursor();
    Text.clear();
    Text.go(1,1);
    for (int i = 1; i < 81; i++){
      System.out.print(Text.colorize("*",Text.MAGENTA));
    }
  }

}
