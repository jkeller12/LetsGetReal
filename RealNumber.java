public class RealNumber extends Number{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return "" + getValue();
  }

  //---------ONLY EDIT BELOW THIS LINE------------

  /*
  *Return true when the values are within 0.001% of eachother.
  *Special case: if one is exactly zero, the other must be exactly zero.
  */

  /*
  public boolean equals(RealNumber other){

    final double EPSILON = Math.abs(((value*.001)/100 +
                            (other.getValue()*.001)/100)/2);
    if (other.getValue() == 0.0 && value == 0.0)
    {
      return true;
    }

    return Math.abs(other.getValue() - value) < EPSILON;
    //return false;
  }/*

  /*
  *Return a new RealNumber that has the value of:
  *the sum of this and the other
  */
  public RealNumber add(RealNumber other){
     //other can be ANY RealNumber, including a RationalNumber
     //or other subclasses of RealNumber (that aren't written yet)

     double Sum = (other.getValue() + value);
     RealNumber Return_Value = new RealNumber(Sum);
     return Return_Value;

  }

  /*
  *Return a new RealNumber that has the value of:
  *the product of this and the other
  */
  public RealNumber multiply(RealNumber other){
      RealNumber Return_Value = new RealNumber(other.getValue() * value);
      return Return_Value;
  }

  /*
  *Return a new RealNumber that has the value of:
  *this divided by the other
  */
  public RealNumber divide(RealNumber other){

    RealNumber Return_Value = new RealNumber(value / other.getValue());
    return Return_Value;
  }

  /*
  *Return a new RealNumber that has the value of:
  *this minus the other
  */
  public RealNumber subtract(RealNumber other){
    double Difference = ( value - other.getValue());
    RealNumber Return_Value1 = new RealNumber(Difference);
    return Return_Value1;
  }
}
