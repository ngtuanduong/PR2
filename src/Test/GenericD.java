package Test;

import java.util.List;

public class GenericD {

 public  double sumOfList(List<? extends Number> list) {
  double s = 0.0;
  for (Number n : list)
   s += n.doubleValue();
  return s;
 }

}
