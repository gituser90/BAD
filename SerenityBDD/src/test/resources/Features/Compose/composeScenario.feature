@ComposeMail
Feature: Compose a mail via Gmail.com
  As a Valid User
  I want to compose a mail
  So that I can send a mail.

  Scenario Outline: Success Compose
    Given I use Valid "<userName>" and Valid "<password>"
    And I perform Login Action
    And I should see my Account Mails
    When I compose an email to "<ToAddress>" "<Subject>" "<Body>"
    Then I should see a successful mail sent.

    @prod
    Examples: Valid Data
      | userName    | password      | ToAddress             |Subject				|Body					|
      | jatin.cs.90 | ibm | jatin.cs.90@gmail.com |Testing				|Testing body	|
