# MDITask
Introduction

This project tests the functionalities of Amazon.eg website using Java and Selenium. It consists of three scenarios that are described in detail below.
Prerequisites

    Java Development Kit (JDK) installed
    Apache Maven installed
    Selenium and TestNG libraries added to the project
    A web driver for your preferred browser (e.g. ChromeDriver for Google Chrome)

How to run the tests

    Clone the repository to your local machine
    Navigate to the root directory of the project in your terminal
    Compile the project by running mvn clean compile
    Run the tests by executing the command mvn test
    install the dependencies in the pom.xml file

Scenario 1: Verify that user cannot log in with valid but not registered email

In this scenario, we will verify that a user cannot log in to the Amazon.eg website with a valid email that is not registered.
    Open Scenario1 class and run it leading to:
    Open the Amazon.eg website in your browser
    Navigate to the login page
    Enter a valid email in the email field
    Enter any password in the password field
    Attempt to log in
    Verify that the user cannot log in and that an error message is displayed

Scenario 2: Verify that items are added to the cart correctly

In this scenario, we will verify that items can be added to the cart correctly and that the correct details (name, price, quantity, and subtotal) are displayed in the cart.
    Open Scenario2 class and run it leading to:
    Open the Amazon.eg website in your browser
    Navigate to the "All" tab
    Go to "Today's Deals"
    Click on the 2nd category
    Click on the 1st product in this category
    Click on the 2nd item in this product
    Add the item to the cart with a quantity of 2
    Do all the necessary actions to add the item to the cart
    Go to the cart
    Verify that the correct items have been added to the cart and that the details (name, price, quantity, and subtotal) are correct

Scenario 3: Verify that you cannot see "Your Orders" and "Your Addresses" pages if you are not logged in

In this scenario, we will verify that a user cannot see the "Your Orders" and "Your Addresses" pages if they are not logged in. We will also verify that the "Your Lists" intro screen can be seen.
    Open Scenario3 class and run it leading to:
    Open the Amazon.eg website in your browser
    Navigate to the "Hello, sign in Account & Lists" link at the top right corner
    Select "Your Orders"
    Verify that the user cannot see the orders page when not signed in
    Select "Your Addresses"
    Verify that the user cannot see the addresses page when not signed in
    Select "Your Lists"
    Verify that the user can see the intro screen for "Your Lists"

Conclusion

This project demonstrates the use of Java and Selenium to test the functionalities of the Amazon.eg website. The steps described in the README can be used to run the tests and verify the functionalities.
