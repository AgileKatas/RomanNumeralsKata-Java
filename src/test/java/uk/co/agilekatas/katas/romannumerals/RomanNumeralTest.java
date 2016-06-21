package uk.co.agilekatas.katas.romannumerals;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumeralTest {

  @Test
  public void convertsOneToI() {
    RomanNumeral romanNumeral = new RomanNumeral(1);
    assertThat(romanNumeral.asNumeral()).isEqualTo("I");
  }

  @Test
  public void convertsTwoToII() {
    RomanNumeral romanNumeral = new RomanNumeral(2);
    assertThat(romanNumeral.asNumeral()).isEqualTo("II");
  }

  @Test
  public void convertsThreeToIII() {
    RomanNumeral romanNumeral = new RomanNumeral(3);
    assertThat(romanNumeral.asNumeral()).isEqualTo("III");
  }

  @Test
  public void convertsFourToIX() {
    RomanNumeral romanNumeral = new RomanNumeral(4);
    assertThat(romanNumeral.asNumeral()).isEqualTo("IV");
  }

  @Test
  public void convertsFiveToV() {
    RomanNumeral romanNumeral = new RomanNumeral(5);
    assertThat(romanNumeral.asNumeral()).isEqualTo("V");
  }

  @Test
  public void convertsSixToVI() {
    RomanNumeral romanNumeral = new RomanNumeral(6);
    assertThat(romanNumeral.asNumeral()).isEqualTo("VI");
  }

  @Test
  public void convertsNineToIX() {
    RomanNumeral romanNumeral = new RomanNumeral(9);
    assertThat(romanNumeral.asNumeral()).isEqualTo("IX");
  }
  
}
