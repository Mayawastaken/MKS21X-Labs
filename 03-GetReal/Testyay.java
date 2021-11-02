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
    RationalNumber R9 = new RationalNumber(65,5);
    RationalNumber R10 = new RationalNumber(12345,0);

    System.out.println(R1.getValue());
    System.out.println(R2.getValue());
    System.out.println(R3.getValue());
    System.out.println(R4.getValue());
    System.out.println(R5.getValue());
    System.out.println(R6.getValue());
    System.out.println(R7.getValue());
    System.out.println(R8.getValue());
    System.out.println(R9.getValue());
    System.out.println(R10.getValue());
  }
}
