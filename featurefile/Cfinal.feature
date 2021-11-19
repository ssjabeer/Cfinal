Feature: Adactin App - Booking Hotel

@login
Scenario: Login page for adactin hotel 
Given User need to launch Webpage 
When User provides a valid username and password 
Then click on signin 

@searchhotel 
Scenario: Enter the mandatory fields 
Given Select your location from the list
When Select your hotel 
And Select your room type 
And select number of rooms you want 
And Enter your Check in date when you need to book 
And Enter Check out data when you leave the hotel
And Select number of persons to stay 
And Select if any child is there 
Then Click on Search button

@SelectHotel
Scenario: Select your required Hotel name
Given check hotel details 
When click on selecthotel radio button
Then Move to Book hotel 

@Pay&Book 
Scenario: Make Payment to book your selected hotel
Given Enter your First name 
When Enter your Last name 
And Entr your Address 
And Enter a Valid CREDITCARD NUMBER 
And Select your Card type 
And Select your valid Expiry month 
And Select your Valid Expiry Year 
And Enter your CVV number of the selected card 
Then Click on booknow button

@ConfirmBookingHistory 
Scenario: View confirm booking history
Given Navigate to Booking confirm page 
When Take a screenshot of confirmed booking 
Then Click on Logout Button









 