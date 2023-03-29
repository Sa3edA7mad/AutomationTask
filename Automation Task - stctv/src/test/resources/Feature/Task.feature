Feature: Validate prices for different countries

  @Run
  Scenario Outline: Validate lite package in KSA English
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
  Scenario Outline: Validate lite package in KW English
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
  Scenario Outline: Validate lite package in Bahrain English
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

  @Run
  Scenario Outline: Validate lite package in KSA Arabic
    Given the subscribe page opens
    When switching to Arabic page
    When the selected county is "<county>"
    And the selected language is "<language>"
    Then the package type "<type>" is showing
    And the package "<type>" price "<priceAndCurrency>" is correct
    Examples:
      | type     | priceAndCurrency  | county   | language |
      | لايت     | 15 ريال سعودي/شهر | السعودية | ar       |
      | الأساسية | 25 ريال سعودي/شهر | السعودية | ar       |
      | بريميوم  | 60 ريال سعودي/شهر | السعودية | ar       |
  @Run
  Scenario Outline: Validate lite package in KW Arabic
    Given the subscribe page opens
    Given the subscribe page for Kuwait opens
    When switching to Arabic page
    When the selected county is "<county>"
    And the selected language is "<language>"
    Then the package type "<type>" is showing
    And the package "<type>" price "<priceAndCurrency>" is correct
    Examples:
      | type     | priceAndCurrency    | county | language |
      | لايت     | 1.2 دينار كويتي/شهر | الكويت | ar       |
      | الأساسية | 2.5 دينار كويتي/شهر | الكويت | ar       |
      | بريميوم  | 4.8 دينار كويتي/شهر | الكويت | ar       |
  @Run
  Scenario Outline: Validate lite package in Bahrain Arabic
    Given the subscribe page opens
    Given the subscribe page for Bahrain opens
    When switching to Arabic page
    When the selected county is "<county>"
    And the selected language is "<language>"
    Then the package type "<type>" is showing
    And the package "<type>" price "<priceAndCurrency>" is correct
    Examples:
      | type     | priceAndCurrency   | county  | language |
      | لايت     | 2 دينار بحريني/شهر | البحرين | ar       |
      | الأساسية | 3 دينار بحريني/شهر | البحرين | ar       |
      | بريميوم  | 6 دينار بحريني/شهر | البحرين | ar       |