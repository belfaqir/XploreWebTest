Feature: Fill the form Test

  Scenario Outline: happy path fill form
    Given the user is in welcome page
    When the user fill the "<country">
    And type "<address>" and type "<email>" and type "<phone>"
    And clicks on save button
    Then he got a confirmation message

    Examples: 
      | country | address            | email                  | phone      |
      | Morocco | 12 rue marx dormoy | imad@yahoo.fr          | 0663656585 |
      | Mexico  | 1455 rue tata      | hellomexico@been.sport |  010123255 |

  #| country | address | email  | phone|
  Scenario Outline: happy path fill form
    Given the user is in welcome page
    When the user fill the "<country">
    And type "<address>" and type "<email>" and type "<phone>"
    And clicks on save button
    Then he got an "<error>" message

    Examples: 
      | country | address              | email                  | phone      | error                             |
      | Morocco | 12 rue marx dormoy   | imad@yahoo.fr          |            | Please enter a valid phone number |
      | Morocco | 12 rue marx dormoy   | imadyahoo.fr           | 1414145455 | Please enter a valid email        |
      | Morocco | 12 rue marx dormoy   |                        |  122256588 | Please enter a valid email        |
      | Mexico  |                      | hellomexico@been.sport |  010123255 | Please enter your address         |
      |         | adresse quelque part | email@toto             |  123252569 | Please choose your country        |

  Scenario: logout from the site
    Given the user is in welcome page
    When teh user clicks on logout button
    Then he is redirected the main page
