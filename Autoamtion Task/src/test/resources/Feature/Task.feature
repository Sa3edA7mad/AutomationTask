Feature: Validate prices for different countries

  Scenario Outline: Validate lite package in KSA
    Given the subscribe page opens
    When the selected county is "<county>"
    And the selected language is "<language>"
#    Then the package type "<type>" is showing
#    And the package price "<price>" is correct
#    And the currency "<currency>" is correct
    Examples:
      | type | price | currency | county | language |
      | type | price | currency | KSA    | en       |



