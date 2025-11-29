Feature: Registration Functionality
  
  @Smoke
  Scenario: To verify Registration functionality by entering valid credentials
  
   Given User has opened the browser and launched the applicationn
   When User enters valid First namee
   And User enters valid Last namee
   And User enters valid Email IDD
   And User enters valid Telephonee
   And User enters valid Passwordd
   And User enters valid Confirm Passwordd
   And User clicks on radion button noo
   And User clicks on privacy policy checkboxx
   And User cliks on continue buttonn
   Then User should be Registeredd