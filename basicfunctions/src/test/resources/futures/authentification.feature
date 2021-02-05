Feature: authentification Test

  Scenario Outline: test ok authentification
    Given the user is in the authentification page
    When the user type "<user>" and  "<pass>"
    And clicks on login button
    Then he id redirected to a welcome page
    And find welcome "<expression>"
    And quit the browser

    Examples: 
      | user  | pass  | expression      |
      | name1 | 12345 | Hello|
     | name1 | 12345 | name1 |
     | name2 | 12345 | name2 |

  Scenario Outline: test ko authentification with bad password or empty
    Given the user is in the authentification page
    When the user type "<user>" and  "<pass>"
    And clicks on login button
    Then he stills in the same page
    And get an "<error>"
    And quit the browser

    Examples: 
      | user  | pass | error               |
      | name1 | pass | Password is invalid |
      | name2 |      | Password is invalid |

  Scenario Outline: test ko authentification with empty user
    Given the user is in the authentification page
    When the user type "<user>" and  "<pass>"
    And clicks on login button
    Then he stills in the same page
    And get an "<error>"
    And quit the browser

    Examples: 
      | user  | pass | error                         |
      | name1 | pass | Please provide your full name |
      | name2 | pass | Please provide your full name |
