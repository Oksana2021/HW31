Feature: Logged in user should be able to search  for necessary music artist and then  play all available tracks.


 Background: Login into account with correct credentials
  Given User navigates to Mixcloud website
  When User clicks on the login button on page
  And User enters a valid username
  And User enters a valid password
  When User clicks on the log in button
  Then User should be successfully logged in


 Scenario: Add Martin Garrix in favorites
  Given User clicks Search field
  When User clicks on the artistname profile button
  And User clicks on the add artistname show to favorites
  And User clicks on the your profile button
  Then User should have artistname show in favorites
  When User clicks on the delete artistname show from favorites
  Then User should'n have artistname show in favorites
