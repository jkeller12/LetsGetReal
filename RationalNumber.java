public class RationalNumber extends RealNumber
{
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *  If the denominator is negative, negate both numerator and denominator
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(0.0);//this value is ignored!
    if (deno < 0)
    {
      denominator = -1 * deno;
      numerator = -1 * nume;
    }
    else if (deno == 0)
    {
      denominator = 1;
      numerator = 0 ;
    }
    else{
      numerator = nume;
      denominator = deno;
    }
    reduce();
  }

  public double getValue(){
    double Value = (double) numerator / denominator;
    return Value;


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
    RationalNumber Return_Value = new RationalNumber(denominator,  numerator);
    return Return_Value;
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    return other.getNumerator() == numerator && other.getDenominator() == denominator;
  }


  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    if (denominator == 1){
      return "" + numerator;
    }
    if (numerator == 0)
    {
      return "" + numerator;
    }
    return "" + numerator + "/" + denominator;
  }

  /**Calculate the GCD of two integers.
  *@param a the first integer
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b){

    if (b == 0)
    {
      return a;
    }
    else{
      return gcd(b, a % b);
    }
  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
    int Old_Nume = numerator;
    numerator = numerator / gcd(numerator, denominator);
    denominator = denominator / gcd(Old_Nume, denominator);
    if (denominator < 0)
    {
      numerator = numerator * -1 ;
      denominator = denominator * -1;
    }
  }
  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    int New_Nume = numerator * other.getNumerator();
    int New_Deno = denominator * other.getDenominator();
    RationalNumber Return_Value = new RationalNumber(New_Nume, New_Deno);
    return Return_Value;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    int New_Nume = numerator * other.getDenominator();
    int New_Deno = denominator * other.getNumerator();
    RationalNumber Return_Value = new RationalNumber(New_Nume, New_Deno);
    return Return_Value;
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    int New_Nume = numerator * other.getDenominator() + (other.getNumerator() * denominator);
    int New_Deno = denominator * other.getDenominator();
    RationalNumber Return_Value = new RationalNumber(New_Nume, New_Deno);
    return Return_Value;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    int New_Nume = numerator * other.getDenominator() - (other.getNumerator() * denominator);
    int New_Deno = denominator * other.getDenominator();
    RationalNumber Return_Value = new RationalNumber(New_Nume, New_Deno);
    return Return_Value;
  }
}
