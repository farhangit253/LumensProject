Feature: This is to test User Registration operation in Lumens page

@Scenario1
Scenario: Verifying User Registration functionality
Given user able to open browser and enter url
Then user able to mouseover on account and select my account
Then user able to fill details for account creation
Then user able to click createaccount button

@Scenario2
Scenario: user is able to Login Lumens  application
    Given user able to open browser and enter url
    When Mouse over to account and click sign In button
    Then Enter the valid credentials
    
@Scenario3   
Scenario: user is able to add the product to cart
 Given user able to open browser and enter url
 When Mouse over to account and click sign In button
 Then Enter the valid credentials
 Then user able to navigate to ligthings and Large Chandelier
 Then user is able to select the product and add to cart
 
 @Scenario4
 Scenario: user in valid login operation
 Given user able to open browser and enter url
 When Mouse over to account and click sign In button
 Then Enter the invalid credentials
 Then user should get an error and takes screenshot
 
 @Scenario5
 Scenario: user is able to Signout Lumens  application
    Given user able to open browser and enter url
    When Mouse over to account and click sign In button
    Then Enter the valid credentials
    Then again mousehover on account click on signOut
 
 @Scenario6
  Scenario: user is able to Login Live chat   
    Given user able to open browser and enter url
    Then user should click livechat on homepage and login with valid credentials
    
@Scenario7
Scenario: user is able navigate through tabs
 Given user able to open browser and enter url
 When Mouse over to account and click sign In button
 Then Enter the valid credentials
 Then user able to navigate to ligthings and navigate Large Chandelier
 
 @Scenario8
 Scenario: user is able to search the product
 Given user able to open browser and enter url
 When Mouse over to account and click sign In button
 Then Enter the valid credentials
 Then user should enter the product name and able to search that product in search bar
 
    
    
 
 
