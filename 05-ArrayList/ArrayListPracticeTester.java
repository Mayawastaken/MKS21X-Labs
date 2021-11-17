import java.util.ArrayList;
public class ArrayListPracticeTester{
  public static void main(String args[]){
    ArrayList<String> AL1 = new ArrayList<String>(100);
    ArrayList<String> AL2 = new ArrayList<String>(10);
    ArrayList<String> AL3 = new ArrayList<String>(3);
    ArrayList<String> AL4 = new ArrayList<String>(3);
    ArrayList<String> AL5 = new ArrayList<String>(5);
    ArrayList<String> AL6 = new ArrayList<String>(8);
    ArrayList<String> AL7 = new ArrayList<String>(0);

    for (int i = 0; i < 100; i++){
      if (Math.random() < .1){
        AL1.add("");
      }
      else{
        AL1.add("NOT EMPTY");
      }
    }
    System.out.println(AL1);
    System.out.println(ArrayListPractice.replaceEmpty(AL1));

    for (int i = 0; i < 10; i++){
      if (Math.random() < .33){
        AL2.add("snap");
      }
      else if (Math.random() < .66){
        AL2.add("crackle");
      }
      else{
        AL2.add("pop");
      }
    }
    System.out.println(AL2);
    System.out.println(ArrayListPractice.makeReversedList(ArrayListPractice.makeReversedList(AL2)));
    System.out.println(ArrayListPractice.makeReversedList(AL2));


    for (int i = 0; i < 3; i++){
      AL3.add("AL3 " + i);
    }
    for (int i = 0; i < 3; i++){
      AL4.add("AL4 " + i);
    }
    for (int i = 0; i < 5; i++){
      AL5.add("AL5 " + i);
    }
    for (int i = 0; i < 8; i++){
      AL6.add("AL6 " + i);
    }

    System.out.println(AL3);
    System.out.println(AL4);
    System.out.println(AL5);
    System.out.println(AL6);
    System.out.println(AL7);


    System.out.println(ArrayListPractice.mixLists(AL3, AL4));
    System.out.println(ArrayListPractice.mixLists(AL4, AL3));
    System.out.println(ArrayListPractice.mixLists(AL3, AL5));
    System.out.println(ArrayListPractice.mixLists(AL4, AL6));
    System.out.println(ArrayListPractice.mixLists(AL6, AL4));
    System.out.println(ArrayListPractice.mixLists(AL7, AL4));
    System.out.println(ArrayListPractice.mixLists(AL7, AL7));
  }



}
