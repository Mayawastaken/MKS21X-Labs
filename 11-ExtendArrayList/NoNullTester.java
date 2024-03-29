import java.util.ArrayList;
public class NoNullTester{
  public static void main(String[] args){
    NoNullArrayList<String> S1 = new NoNullArrayList<String>();
    NoNullArrayList<String> S2 = new NoNullArrayList<String>(5);
    NoNullArrayList<Integer> I1 = new NoNullArrayList<Integer>(5);
    NoNullArrayList<Integer> I2 = new NoNullArrayList<Integer>();

    System.out.println(S1.toString());
    System.out.println(S2.toString());
    System.out.println(I1.toString());
    System.out.println(I2.toString());

    S1.add("heyyo");
    S1.add("woohoo");
    S1.add("coolio");
    I1.add(24);
    I1.add(67);
    I1.add(-47);
    // S1.add(null);
    // I1.add(null);

    System.out.println(S1.toString());
    System.out.println(I1.toString());

    S1.add(2, "RAWR");
    I1.add(0, 0);

    System.out.println(S1.toString());
    System.out.println(I1.toString());

    S1.set(2, "not RAWR");
    I1.set(0, 1000);

    System.out.println(S1.toString());
    System.out.println(I1.toString());
  }
}
