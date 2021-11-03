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
    RealNumber Re1 = new RealNumber(5);
    RealNumber Re2 = new RealNumber(0);
    RealNumber Re3 = new RealNumber(3.1415);
    RealNumber Re4 = new RealNumber(-26);
    RealNumber Re5 = new RealNumber(-5);
    RealNumber Re6 = new RealNumber(8);



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
    System.out.println(R8.reciprocal()); // 24/-8 = -8/24
    System.out.println(R10.reciprocal()); // 0/1, because R10 becomes 1/0 which is thus 0/1
    System.out.println(" ");
    System.out.println((R1.reciprocal()).getValue()); // 2.0
    System.out.println((R8.reciprocal()).getValue()); // -3.0
    System.out.println((R10.reciprocal()).getValue()); // 0.0
    System.out.println(" ");
    System.out.println(R6.equals(R7)); // true
    System.out.println(R1.equals(R2)); // true
    System.out.println(R3.equals(R3)); // true
    System.out.println(" ");
    /* System.out.println(RationalNumber.gcd(16, 32)); I made gcd public to test
    System.out.println(RationalNumber.gcd(-16, 32));   these on my own, they work
    System.out.println(RationalNumber.gcd(10, 15));
    System.out.println(RationalNumber.gcd(48, 72));
    System.out.println(RationalNumber.gcd(-6, -9));
    System.out.println(RationalNumber.gcd(67, 98));
    System.out.println(RationalNumber.gcd(-67, 98)); */
    System.out.println(R1.multiply(R2)); // 1/4
    System.out.println(R1.multiply(R3)); // 1/4
    System.out.println(R2.multiply(R3)); // 1/4
    System.out.println(R6.multiply(R7)); // 49/64
    System.out.println(R1.multiply(R10)); // 0/1
    System.out.println(R5.multiply(R8)); // 1/6
    System.out.println(R9.multiply(R1)); // 13/2
    System.out.println(" ");
    System.out.println(R1.divide(R2)); // 1/1
    System.out.println(R1.divide(R3)); // 1/1
    System.out.println(R2.divide(R3)); // 1/1
    System.out.println(R6.divide(R7)); // 1/1
    System.out.println(R1.divide(R10)); // 0/1
    System.out.println(R5.divide(R8)); // 3/2
    System.out.println(R9.divide(R1)); // 26/1
    System.out.println(" ");
    System.out.println(R1.add(R2)); // 1/1
    System.out.println(R1.add(R3)); // 1/1
    System.out.println(R2.add(R3)); // 1/1
    System.out.println(R6.add(R7)); // 7/4
    System.out.println(R1.add(R10)); // 1/2
    System.out.println(R5.add(R8)); // -5/6
    System.out.println(R9.add(R1)); // 27/2
    System.out.println(" ");
    System.out.println(R1.subtract(R2)); // 0/1
    System.out.println(R1.subtract(R3)); // 0/1
    System.out.println(R2.subtract(R3)); // 0/1
    System.out.println(R6.subtract(R7)); // 0/1
    System.out.println(R1.subtract(R10)); // 1/2
    System.out.println(R5.subtract(R8)); // 1/-6 = -1/6
    System.out.println(R9.subtract(R1)); // 25/2
    System.out.println(" ");
    System.out.println(Re1.multiply(Re2)); // 0.0
    System.out.println(Re1.multiply(Re3)); // 15.7075...
    System.out.println(Re6.multiply(Re5)); // -40.0
    System.out.println(Re4.multiply(R1)); // -13.0
    System.out.println(Re2.multiply(R10)); // 0.0
    System.out.println(" ");
    System.out.println(Re1.divide(Re2)); // 0.0
    System.out.println(Re1.divide(Re3)); // 1.59...
    System.out.println(Re2.divide(Re3)); // 0.0
    System.out.println(Re6.divide(R5)); // -16.0
    System.out.println(Re1.divide(R10)); // 0.0
    System.out.println(" ");
    System.out.println(Re1.add(Re2)); // 5.0
    System.out.println(Re1.add(Re3)); // 8.1415
    System.out.println(Re1.add(Re5)); // 0.0
    System.out.println(Re4.add(R9)); // -13.0
    System.out.println(Re6.add(Re5)); // 3.0
    System.out.println(" ");
    System.out.println(Re1.subtract(Re2)); // 5.0
    System.out.println(Re1.subtract(Re3)); // 1.8585
    System.out.println(Re2.subtract(Re3)); // -3.1415
    System.out.println(Re6.subtract(R10)); // 8.0
    System.out.println(Re1.subtract(R5)); // 5.5

  }
}
