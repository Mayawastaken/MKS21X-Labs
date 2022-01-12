public class Border{
  public static void makeBorder(){
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

    int[] ary = new int[4];
    for (int i = 0; i < ary.length; i++){
      ary[i] = (int)(Math.random() * 100); //use seed ahahaha aslfjkdsflkj
      Text.go(2, (i+1)*(80/5)); //div 80 - 2 evenly? idk uh
      if (ary[i] < 25){
        System.out.print(Text.colorize("" + ary[i], Text.RED));
      }
      else if (ary[i] > 75){
        System.out.print(Text.colorize("" + ary[i], Text.GREEN));
      }
      else{
        System.out.print(Text.colorize("" + ary[i], Text.WHITE));
      }
    }
    Text.go(31,1); //get terminal back down
  }

  // public static void main(String[] args){
  //
  // }
}
