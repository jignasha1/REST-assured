Feature: Uber Booking Feature

@Regression @Smoke
Scenario: Booking cab sedan
Given User wants to select a car type "sedan" from uber app
When user select car "sedan" and pick up point "Banglore" and drop location "Pune"
Then Driver starts the journey
And Driver ends the journey
Then user pays 1000 USD

@Smoke
Scenario: Booking cab SUV
Given User wants to select a car type "suv" from uber app
When user select car "sedan" and pick up point "Banglore" and drop location "Hydrabad"
Then Driver starts the journey
And Driver ends the journey
Then user pays 1000 USD

@Prod
Scenario: Booking cab Mini
Given User wants to select a car type "mini" from uber app
When user select car "sedan" and pick up point "Pune" and drop location "Mumbai"
Then Driver starts the journey
And Driver ends the journey
Then user pays 1000 USD