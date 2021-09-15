Feature: Get Users Details
  Scenario:
    Given url 'https://reqres.in/api/users/1'
    When method get
    Then status 200
