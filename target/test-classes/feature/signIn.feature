  @test
Feature: Title of your feature
  I want to use this template for my feature file
  
   @test002
  Scenario Outline: Login to the application with invalid credentials.
    Given The user is in signIn Page of dsportal
    When  The user gets the Data from excel with "<testId>" and "<sheetName>"
    And   The user clicks on login button in login page
    Then  The user is logged in to the Home page with a message "Invalid Username and Password"
     
   Examples:
   |testId|sheetName|
   |    b |Sheet1   |
   
  @test002
  Scenario Outline: Login to the Application with invalid credentials.
    Given User is in signIn Page of Dsportal
    When   User gets the Data from excel with "<testId>" and "<sheetName>"
    And    user clicks on the login button in login page
    Then   user is logged in to the Home page with a Message "You are logged in"
     
   Examples:
   |testId|sheetName|
   |    c |Sheet1   |

  @test002
  Scenario Outline: Login to the application with valid credentials.
    Given The user is in sign in page
    When  The user gets the data from the datasheet with "<testId>" and "<sheetName>"
    And   The user clicks on Login button
    Then  The user is logged in to the homepage with a message "You are logged in"
     
   Examples:
   |testId|sheetName|
   |    a |Sheet1   |
  
   