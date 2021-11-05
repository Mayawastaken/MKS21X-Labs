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

  }
}
