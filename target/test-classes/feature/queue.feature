 @tagS
Feature: queue


      
  @test008
   Scenario Outline:
   Given The user is in the queue page after logged in with input from data sheet under "<testId>" and "<sheetName>"
   When  The user clicks Implementation of Queue in Python button
   And   The user clicks Try Here button in Implementation of Queue in Python page
   When  The User enters pyton code and run it in Implementation of Queue in Python
   Then  The user should get print statement for Implementation of Queue in Python
    Examples:
   |testId|sheetName|
   |    a |Sheet1   |
   
   @test008
    Scenario Outline:
   Given The user is in the queue page after logged in with input from data sheet under "<testId>" and "<sheetName>"
   When  The user clicks Implementation using collections
   And   The user clicks Try Here button in Implementation using collections page
   When  The User enters pyton code and run it in Implementation using collections
   Then  The user should get print statement for Implementation using collections
    Examples:
   |testId|sheetName|
   |    a |Sheet1   |
   
   @test008
    Scenario Outline:
   Given The user is in the queue page after logged in with input from data sheet under "<testId>" and "<sheetName>"
   When  The user clicks Implementation using array
   And   The user clicks Try Here button in Implementation using array page
   When  The User enters pyton code and run it in Implementation using array
   Then  The user should get print statement for Implementation using array
    Examples:
   |testId|sheetName|
   |    a |Sheet1   |
   
   @test008
    Scenario Outline:
   Given The user is in the queue page after logged in with input from data sheet under "<testId>" and "<sheetName>"
   When  The user clicks Queue Operations
   And   The user clicks Try Here button in Queue Operations page
   When  The User enters pyton code and run it in Queue Operations
   Then  The user should get print statement for Queue Operations
    Examples:
   |testId|sheetName|
   |    a |Sheet1   |
