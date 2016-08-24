@Login
Feature: Login into Gmail.com
As a Valid User
I want to login to the mails
So that I can check my mails

Scenario Outline: Success Login

Given I use Valid "<userName>" and Valid "<password>"
When I perform Login Action
Then I should see my Account Mails.

@prod
Examples: Valid Data
|userName|password|
|jatin.cs.90|ibm|