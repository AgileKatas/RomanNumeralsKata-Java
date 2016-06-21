package uk.co.agilekatas.katas.romannumerals.steps;

import uk.co.agilekatas.katas.romannumerals.RomanNumeral;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class ArabicToRomanSteps {

  private RomanNumeral romanNumeral;

  @When("^I enter [\\d*]$")
  public void I_enter_number(int number) {
    romanNumeral = new RomanNumeral(number);
  }

  @Then("[^\"] is returned$")
  public void numeral_is_returned(String numeral) {
    assertThat(romanNumeral.asNumeral()).isEqualTo(numeral);
  }

}
