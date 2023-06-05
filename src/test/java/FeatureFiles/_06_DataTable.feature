Feature: DataTable Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User sholud login successfully


  Scenario: Create Country
    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | countries  |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | mertpolqpqaaaaw |
      | codeInput | 156477          |


    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed

    And  User delete item from Dialog Content
      | mertpolqpqaaaaw |

  @Regression
  Scenario: Create Nationalities
    And Click on the element in LeftNav
      | setup         |
      | parameters    |
      | nationalities |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | mertpolqpqawwww |

    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete item from Dialog Content

      | mertpolqpqawwww |

    Then Success message should be displayed

    @Regression
  Scenario: Create Fees
    And Click on the element in LeftNav

      | setup      |
      | parameters |
      | fees       |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput       | gfdgdfddd  |
      | codeInput       | 1564771232 |
      | integrationCode | 11331      |
      | priorityCode    | 5435311    |

    And Click on the element in Dialog
      |toggleBar |
      |saveButton |

    Then Success message should be displayed

    And User delete item from Dialog Content
      | gfdgdfddd  |

    Then Success message should be displayed









