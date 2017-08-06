import java.util.*;



public interface Fraction{

   Fraction plus(Fraction x);
   Fraction times(int n);
   Fraction times(Fraction x);
   Fraction reciprocal();
   double value();
}

class harmonicMean{

public Fraction harmonicMean(Fraction x, Fraction y) {

   return x.reciprocal().plus(y.reciprocal()).reciprocal().times(2);
}
}
