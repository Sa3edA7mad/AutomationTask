Feature: Validate prices for different countries
@NotRun
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

@Run
  Scenario Outline: Validate lite package in KW
    Given the subscribe page for Kuwait opens
    When the selected county is "<county>"
    And the selected language is "<language>"
    Then the package type "<type>" is showing
    And the package "<type>" price "<priceAndCurrency>" is correct
    Examples:
      | type    | priceAndCurrency | county | language |
      | LITE    | 1.2 KWD/month    | Kuwait | en       |
      | CLASSIC | 2.5 KWD/month    | Kuwait | en       |
      | PREMIUM | 4.8 KWD/month    | Kuwait | en       |
  @Run
  Scenario Outline: Validate lite package in Bahrain
    Given the subscribe page for Bahrain opens
    When the selected county is "<county>"
    And the selected language is "<language>"
    Then the package type "<type>" is showing
    And the package "<type>" price "<priceAndCurrency>" is correct
    Examples:
      | type    | priceAndCurrency | county  | language |
      | LITE    | 2 BHD/month      | Bahrain | en       |
      | CLASSIC | 3 BHD/month      | Bahrain | en       |
      | PREMIUM | 6 BHD/month      | Bahrain | en       |