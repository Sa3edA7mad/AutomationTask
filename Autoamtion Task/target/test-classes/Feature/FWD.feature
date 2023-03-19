Feature: Testing the e-commerce site.

  Scenario: User could register with valid data
    Given web site opens
    When user click on register button
    When user enters data and click on register
    Then confirmation message is shown

  Scenario: User could login with valid email and password
    Given web site opens
    When user click on login button
    When user enters data and click on login
    Then user logged in

  Scenario: User could reset his password successfully
    Given web site opens
    When user click on login button
    When user clicks on forgot password
    When user enter email
    Then recovery confirmation message is shown

  Scenario: logged user could search for any product
    Given web site opens
    When user click on login button
    When user enters data and click on login
    When user enter (Build your own computer) in search
    Then related search result are shown

  Scenario: logged user could switch between currencies US-Euro
    Given web site opens
    When user click on login button
    When user enters data and click on login
    When user select euro
    When user select us
    Then currency is changed

  Scenario: logged user can select different categories
    Given web site opens
    When user click on login button
    When user enters data and click on login
    When user enter (Build your own computer) in search
    Then user can select different categories

    Scenario: logged user could filter with color (no color in the site so will use Manufacturers)
      Given web site opens
      When user click on login button
      When user enters data and click on login
      When user enter (Build your own computer) in search
      Then user filter using manufacturers
      Then validate filer is applied correctly

  Scenario: logged user could add different products to shopping cart
    Given web site opens
    When user click on login button
    When user enters data and click on login
    When user enter (If You Wait) in search
    When clicking on item
    When click add to cart

  Scenario: logged user could add different products to wishlist
    Given web site opens
    When user click on login button
    When user enters data and click on login
    When user enter (If You Wait) in search
    Then click on add to wishlist

  Scenario: logged user could add different products to compare list
    Given web site opens
    When user click on login button
    When user enters data and click on login
    When user enter (If You Wait) in search
    Then click on add to compare list

  Scenario: logged user could create successful order
    Given web site opens
    When user click on login button
    When user enters data and click on login
    When user enter (If You Wait) in search
    When clicking on item
    When click add to cart
    When navigate to cart
    When user agree to the terms and click on continue
    When user moved to check out screen
