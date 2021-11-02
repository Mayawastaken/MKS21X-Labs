public class Testyay{
  public static void main(String[]args){
    RationalNumber R1 = new RationalNumber(1,2);
    RationalNumber R2 = new RationalNumber(2,4);
    RationalNumber R3 = new RationalNumber(3,6);
    RationalNumber R4 = new RationalNumber(3,7);
    RationalNumber R5 = new RationalNumber(-1,2);
    RationalNumber R6 = new RationalNumber(7,8);
    RationalNumber R7 = new RationalNumber(7,8);
    RationalNumber R8 = new RationalNumber(-8,24);
    RationalNumber R9 = new RationalNumber(-65,-5);
    RationalNumber R10 = new RationalNumber(12345,0);

    System.out.println(R1.getValue()); // 0.5
    System.out.println(R2.getValue()); // 0.5
    System.out.println(R3.getValue()); // 0.5
    System.out.println(R4.getValue()); // .428571..
    System.out.println(R5.getValue()); // -0.5
    System.out.println(R6.getValue()); // 0.875
    System.out.println(R7.getValue()); // 0.875
    System.out.println(R8.getValue()); // -0.333..
    System.out.println(R9.getValue()); // 13.0
    System.out.println(R10.getValue()); // 0.0
    System.out.println(" ");
    System.out.println(R10.getNumerator()); // 0
    System.out.println(R10.getDenominator()); // 1
    System.out.println(R9.getNumerator()); // -65
    System.out.println(R9.getDenominator()); // -5
    System.out.println(" ");
    System.out.println(R1.toString()); // 1/2
    System.out.println(R8.toString()); // -8/24
    System.out.println(R10.toString()); // 0/1
    System.out.println(" ");
    System.out.println(R1.reciprocal()); // 2/1
    System.out.println(R8.reciprocal()); // 24/-8
    System.out.println(R10.reciprocal()); // 0/1, because R10 becomes 1/0 which is thus 0/1
    System.out.println(" ");
    System.out.println((R1.reciprocal()).getValue()); // 2.0
    System.out.println((R8.reciprocal()).getValue()); // -3.0
    System.out.println((R10.reciprocal()).getValue()); // 0.0
    System.out.println(" ");
    System.out.println(R6.equals(R7)); // true
    System.out.println(R1.equals(R2)); // false
    System.out.println(R3.equals(R3)); // true
    System.out.println(" ");

  }
}
