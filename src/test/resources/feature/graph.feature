@test
Feature: graph data structure

    
    @test010
   Scenario Outline: 
   Given The user is signed in to the graph with input from data sheet under "<testId>" and "<sheetName>"
   When  The user clicks graph page
   And   The user clicks Try Here button in graph page 
   When  The User enters pyton code and run it in graph page
   Then  The user should get print statement for graph page
       Examples:
   |testId|sheetName|
   |    a |Sheet1   |
     
  @test010
  Scenario Outline: 
   Given The user is signed in to the graph with input from data sheet under "<testId>" and "<sheetName>"
   When  The user clicks Graph Representations button
   And   The user clicks Try Here button in Graph Representations page
   When  The User enters pyton code and run it in Graph Representations
   Then  The user should get print statement for Graph Representations
     Examples:
   |testId|sheetName|
   |    a |Sheet1   |
     

     