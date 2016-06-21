Feature: Convert Arabic number to Roman numeral

  Scenario Outline: Converts number to numeral
    When I enter <number>
    Then <numeral> is returned

    Examples:
      | number | numeral   |
      | 1      | I         |
      | 3      | III       |
      | 9      | IX        |
      | 1066   | MLXVI     |
      | 1989   | MCMLXXXIX |
