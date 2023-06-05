Feature: DataTable Ornek

  Scenario: Users List
    When Write username "mert"
    And  Write username and Password "mert" and "1234"
    And Write username as DataTable
    | mert |
    | okay |
    | polat |

    And Write username and password as DataTable
      | mert |   543 |
      | okay |   5431 |
      | polat |  7657 |