Feature: Validate prices for different countries

  Scenario Outline: Validate lite package in KSA
    Given the subscribe page opens
    When the selected county is "<county>"
    And the selected language is "<language>"
    Then the package type "<type>" is showing
    And the package "<type>" price "<priceAndCurrency>" is correct
    Examples:
      | type    | priceAndCurrency | county | language |
      | LITE    | 15 SAR/month     | KSA    | en       |
      | CLASSIC | 25 SAR/month     | KSA    | en       |
      | PREMIUM | 60 SAR/month     | KSA    | en       |


