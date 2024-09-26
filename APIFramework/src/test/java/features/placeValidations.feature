Feature: Validating Add Object API

  @Regression
  Scenario Outline: Verify if Add Object is Successful
    Given Add Object Payload with "<name>" "<year>" "<price>" "<CPUModel>" "<DiskSize>"
    When user calls "AddObjectAPI" with "POST" http request
    Then the API call got success with status code 200
    And "name" in response body is "<name>"
    And "data.year" in response body is "<year>"
    And "data.price" in response body is "<price>"
    And "data.cpumodel" in response body is "<CPUModel>"
    And "data.hardDiskSize" in response body is "<DiskSize>"
    And "createdAt" is not null

    Examples:
      | name                 | year | price   | CPUModel      | DiskSize |
      | Apple MacBook Pro 16 | 2019 | 1849.99 | Intel Core i9 | 1 TB     |