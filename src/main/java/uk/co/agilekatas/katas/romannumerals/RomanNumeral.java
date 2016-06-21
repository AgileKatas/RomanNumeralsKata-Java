package uk.co.agilekatas.katas.romannumerals;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class RomanNumeral {

  private Map<Integer, String> numberNumerals;

  private final int number;

  public RomanNumeral(int number) {
    initialiseNumerals();
    this.number = number;
  }

  private void initialiseNumerals() {
    Map<Integer, String> temp = new HashMap<Integer, String>();
    temp.put(1, "I");
    temp.put(4, "IV");
    temp.put(5, "V");
    temp.put(9, "IX");
    temp.put(10, "X");
    temp.put(40, "XL");
    temp.put(50, "L");
    temp.put(90, "XC");
    temp.put(100, "C");
    temp.put(400, "CD");
    temp.put(500, "D");
    temp.put(900, "CM");
    temp.put(1000, "M");
    numberNumerals = new TreeMap<Integer, String>(temp).descendingMap();
  }

  public String asNumeral() {
    int tempNumber = this.number;
    StringBuilder numeral = new StringBuilder();
    for (Map.Entry<Integer, String> entry : numberNumerals.entrySet()) {
      while (tempNumber >= entry.getKey()) {
        numeral.append(entry.getValue());
        tempNumber-= entry.getKey();
      }
    }
    return numeral.toString();
  }

}
