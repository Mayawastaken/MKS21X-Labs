import java.util.ArrayList;
public class ArrayListPractice{
  public static ArrayList<String> replaceEmpty( ArrayList<String> data){
    //return an new ArrayList that has all of the values of the original ArrayList except
    //that all empty strings are replaced with the word "Empty".
    ArrayList<String> replaced = new ArrayList<String>();
    for (int i = 0; i  < data.size(); i++){
      if (data.get(i).equals("")){
        replaced.add("Empty");
      }
      else{
        replaced.add(data.get(i));
      }
    }
    return replaced;
  }

  public static ArrayList<String> makeReversedList( ArrayList<String> data){
    //return a new ArrayList that is in the reversed order of the parameter.
    ArrayList<String> reversed = new ArrayList<String>();
    for (int i = data.size() - 1; i > -1; i--){
      reversed.add(data.get(i));
    }
    return reversed;
  }

  public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
    //return a new ArrayList that has all values of a and b in alternating order that is:
    //a[0], b[0], a[1], b[1]...
    //when one list is longer than the other, just append the remaining values to the end.
    ArrayList<String> combined = new ArrayList<String>();
    int shorter;
    ArrayList<String> longer;
    if (a.size() > b.size()) {
      shorter = b.size();
      longer = a;
    }
    else {
      shorter = a.size();
      longer = b;
    }
    for (int i = 0; i < shorter; i++) {
      combined.add(a.get(i));
      combined.add(b.get(i));
    }
    for (int i = shorter; i < longer.size(); i++){
      combined.add(longer.get(i));
    }
    return combined;
  }
}
