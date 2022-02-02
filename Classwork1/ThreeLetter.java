public class ThreeLetter{
  public static void makeWords(int size, String result){
    if (size > 0){
      for (char i = 'a'; i <= 'z'; i++){
        makeWords(size - 1, result + i);
      }
    }
    else{
      System.out.println(result);
    }

  }

  public static void main(String[] args){
    makeWords(3, "");
  }
}
