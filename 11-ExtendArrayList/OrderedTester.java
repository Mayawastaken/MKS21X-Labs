import java.util.ArrayList;
public class OrderedTester{
  public static void main(String[] args){
    OrderedArrayList<String> S1 = new OrderedArrayList<String>();
    OrderedArrayList<String> S2 = new OrderedArrayList<String>(5);
    OrderedArrayList<Integer> I1 = new OrderedArrayList<Integer>(5);
    OrderedArrayList<Integer> I2 = new OrderedArrayList<Integer>();

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
    S1.add(2, "rawr");
    I1.add(0, 0);

    System.out.println(S1.toString());
    System.out.println(I1.toString());

    S1.set(4, "not RAWR");
    //S1.set(14, null);
    //S1.set(4, null);
    I1.set(0, 1000);

    System.out.println(S1.toString());
    System.out.println(I1.toString());
  }
}
