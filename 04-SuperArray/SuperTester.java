public class SuperTester{
  public static void main(String[]args){
    SuperArray SA = new SuperArray();


    System.out.println(SA.toString());
    SA.add("hello");
    System.out.println(SA.toString());
    SA.add("wow");
    SA.add("it");
    SA.add("works!");
    System.out.println(SA.toString());
    System.out.println(SA.toStringDebug());

    for (int i = 0; i < SA.size(); i++){
      System.out.println(SA.get(i));
    }
    for (int i = 0; i <= SA.size(); i++){
      System.out.println(SA.get(i));
    }

    for (int i = 0; i < SA.size(); i++){
      SA.set(i, "" + i);
    }

    System.out.println(SA.toString());
    System.out.println(SA.toStringDebug());

    for (int i = 0; i < SA.size(); i++){
      if (i < SA.size() - 1){
        SA.set(i, SA.get(i+1));
      }
      else {
        SA.set(i, "NOPE!");
      }
    }

    System.out.println(SA.toString());
    System.out.println(SA.toStringDebug());
  }
}
