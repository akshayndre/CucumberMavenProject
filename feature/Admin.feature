Feature:Admin
Scenario:Login with valied credentials
Given User Launch Chrome Browser
When User open URL "https://www.facebook.com/"
And User enter email as "admin@yourstore.com" and password "admin"
And User Click on Login button
Then Page title should be "Dashboard/ nopcommerce administration"
And Close the browser



