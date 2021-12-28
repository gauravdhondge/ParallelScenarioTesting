Feature: Guru99 login and create telecom project

Scenario: telecom project and add customers test scenario

Given user is present on login page
And title of login page is GTPL Bank Home Page
When user enters userID and password 
|userID    | password  |
|mngr376749| vavAqUp   |
And user clicks on login button
Then user is on home page
And user clicks on telecom project
And user clicks on add customer
#And user selects background check as done
When user selects background check as done and enters billing address
| firstname    | lastname    | email                     | address     | mobilenumber |
| madhuri      | dhondge     |gauravdhondge@gmail.com    | Nashik      |8007975732    |
| mangesh      | dhondge     |kulkarnijayesh11@gmail.com | Mumbai      |8830407067    |
And user again comes on telecom projects homepage



Scenario: telecom project and add tariff plan test scenario

Given user is already present on login page
And title of loginpage is GTPL Bank Home Page
When user enter userID and password 
|userID    | password  |
|mngr376749| vavAqUp   |
And user click on login button
Then user is on homepage
And user click on telecom project
And user clicks on add tariff plan
When user enters add tariff plan details and clicks on submit button
|monthly rental|free local min|free international min|free sms pack|local per min charges|international per min charges|sms per charges|
|     1223     |     100      |          200         |     250     |         10          |             12              |      5        |
|     1223     |     100      |          200         |     250     |         10          |             12              |      5        |
Then user again comes to telecom projects homepage by clicking on telecom project
