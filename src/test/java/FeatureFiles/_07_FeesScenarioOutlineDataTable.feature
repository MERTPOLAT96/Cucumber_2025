Feature: Fees multiple values functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User sholud login successfully


  Scenario Outline: Create Fees
    And Click on the element in LeftNav

      | setup      |
      | parameters |
      | fees       |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput       | <name>     |
      | codeInput       | <code>     |
      | integrationCode | <intCode>  |
      | priorityCode    | <priority> |

    And Click on the element in Dialog
      | toggleBar  |
      | saveButton |

    Then Success message should be displayed

    And User delete item from Dialog Content
      | <name> |

    Then Success message should be displayed

    Examples:
      | name  | code | intCode  | priority |
      | m13   | 54   | payPal   | 1233     |
      | m1323 | 5431 | cash     | 1234     |
      | m1324 | 5432 | cheque   | 1235     |
      | m1325 | 5433 | applePay | 1236     |
      | m1326 | 5434 | crypto   | 1237     |
