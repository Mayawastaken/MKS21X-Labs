import java.util.ArrayList;
public class ArrayListPracticeTester{
  public static void main(String args[]){
    ArrayList<String> AL1 = new ArrayList<String>(10000);
    for (int i = 0; i < 10000; i++){
      if (Math.random() < .1){
        AL1.add("");
      }
      else{
        AL1.add("WOOWOOO);
      }
    }
    System.out.println(ArrayListPractice.replaceEmpty(AL1));
  }
}
