Feature: Verify add to cart feature

@AddToCartTest
Scenario: Verify if user is able to add a produt to add to cart
Given user is on Amazon website
When user enters delivery zip code 
Then user search for "Apple iPhone 11 pro max"
And user verifies results as "White" or "Midnight green" on page 1
And user selects "Midnight Green" and moves to the product details page
And user add product to the cart
And users ignores suggestions and proceed to cart

