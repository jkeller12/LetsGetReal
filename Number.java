public abstract class Number{
  public abstract double getValue();

  public int compareTo(Number other){
    if(other.getValue() == getValue())
    {
      return 0;
    }
    else if(other.getValue() > getValue())
    {
      return -1;
    }
    else if(other.getValue() < getValue())
    {
      return +1;
    }
    return 0;
  }


  public boolean equals(Number other){

    final double EPSILON = Math.abs(((getValue()*.001)/100 +
                            (other.getValue()*.001)/100)/2);
    if (other.getValue() == 0.0 && getValue() == 0.0)
    {
      return true;
    }

    return Math.abs(other.getValue() - getValue()) < EPSILON;
  }



}
