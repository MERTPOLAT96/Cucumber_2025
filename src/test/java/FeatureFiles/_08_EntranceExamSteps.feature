Feature: Entrance Exam multiple values functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User sholud login successfully


  Scenario: Create Fees
    And Click on the element in LeftNav

      | entranceExamsOne |
      | setupTwo         |
      | entranceExamsTwo |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | mertexam1 |

    And Click on the element in Dialog
      | academicPeriod  |
      | academicPeriod1 |
      | gradeLevel      |
      | gradeLevel2     |

    And Click on the element in Dialog
      | saveButton |

    And Success message should be displayed

    And Click on the element in LeftNav

      | entranceExamsOne  |
      | setupTwo |
      | entranceExamsTwo      |

    And User delete item from Dialog Content

      | mertexam1 |

    Then Success message should be displayed

