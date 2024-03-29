public class RationalNumber extends RealNumber
{
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(0.0);//this value is ignored!
    if (deno == 0) {
      numerator = 0;
      denominator = 1;
    }
    else {
      numerator = nume;
      denominator = deno;
    }
  }

  public double getValue(){
    return (numerator * 1.0 / denominator * 1.0);
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    return numerator;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    return denominator;
  }
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    RationalNumber recip = new RationalNumber(denominator, numerator);
    return recip;
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    this.reduce();
    other.reduce();
    return ((numerator == other.getNumerator()) && (denominator == other.getDenominator()));
  }


  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    return (numerator + "/" + denominator);
  }

  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b){
    while (!(a == 0)){
      int intermediate = a;
      a = (b % a);
      b = intermediate;
    }
    return b;
  }

    /*use euclids method or a better one*/
    //http://sites.math.rutgers.edu/~greenfie/gs2004/euclid.html

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
    int intermediate = numerator;
    numerator /= gcd(numerator, denominator);
    denominator /= gcd(intermediate, denominator);
  }
  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    int mNume = other.getNumerator() * numerator;
    int mDeno = other.getDenominator() * denominator;
    RationalNumber mult = new RationalNumber(mNume, mDeno);
    mult.reduce();
    return mult;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    int dNume = other.getDenominator() * numerator;
    int dDeno = other.getNumerator() * denominator;
    RationalNumber div = new RationalNumber(dNume, dDeno);
    div.reduce();
    return div;

  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    int lcmDeno = (other.getDenominator() * denominator) / gcd(other.getDenominator(), denominator);
    int factorForOther = lcmDeno / other.getDenominator();
    int factorForNotOther = lcmDeno / denominator;
    int aNume = factorForOther * other.getNumerator() + factorForNotOther * numerator;
    RationalNumber ad = new RationalNumber(aNume, lcmDeno);
    ad.reduce();
    return ad;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    int lcmDeno = (other.getDenominator() * denominator) / gcd(other.getDenominator(), denominator);
    int factorForOther = lcmDeno / other.getDenominator();
    int factorForNotOther = lcmDeno / denominator;
    int sNume = factorForNotOther * numerator - factorForOther * other.getNumerator();
    RationalNumber sub = new RationalNumber(sNume, lcmDeno);
    sub.reduce();
    return sub;
  }
}
