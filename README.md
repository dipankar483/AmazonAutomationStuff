# AmazonAutomationStuff

************Project Description***************

1. The Amazon Automation project is created using Cucumber framework of BDD type
2. We can run the test through the following ways:
	a. through Junit (from eclipse/intelliJ).
	b. through mvn commands which we can integrate later with Jenkins for CI/CD purposes(through command prompt)	
3. Generated html report(in /target/cucumber-html-reports) in pie chart graph,where you can see the details of the test cases executed, for both pass and failed ones. 
4. Since it's a Cucumber based we can run the code for both desktop and mobile(appium is recommended pratice as it has lot of benefits)
5. Many things have been hardcoded due to limited availablity of time crunch, which can be further sub-divided through utils and other ones.
6. Have made some modifications in your requirements like the pincode have to entered first for the avialbility of the product and I have choosen renew product midnight green as the available product(same for the first product) asked for login, to cover end to end scenario which was not possible without login. Hope you understand!
7. One more thing I would like to raise the flag for the Cucumber script is the how we can run for both desktop and mobile web:
@mobile
Scenario: Verify add to cart option
Given the user is on amazon.com site
When the user search for product
Then user selects "Midnight Green"
And user moves to the product details page
And user enters delivery zip code
And user add product to the cart
And users ignores suggestions and proceed to cart

@desktop
Scenario: Verify add to cart option
Given the user is on amazon.com site
When the user search for product
Then user selects "Midnight Green"
And user moves to the product details page
And user enters delivery zip code
And user add product to the cart
And users ignores suggestions and proceed to cart


Hooks to set a variable indicating the version of the site being tested:

Before '@mobile' do
  @version = :mobile
end

Before '@desktop' do
  @version = :desktop
end


