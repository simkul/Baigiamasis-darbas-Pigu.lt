# Baigiamasis darbas

#### Automated tests for chosen scenarios for https://pigu.lt/lt/
* Login with correct and incorrect data 
* Search
* Add needed item to cart 
* Find gift card 

# Tests
### 1. Test login function with correct data
    * enter  correct email
    * enter correct password
    * click on Prisijungti button
    * check if opened profile page
(Expected rezult - open new page with user profile )

### 2. Test login function with correct data
    * enter  correct email
    * enter incorrect password
    * click on Prisijungti button
    * check if appeared error message
(Expected rezult - appeared error messsage, that says "Neteisingi prisijungimo duomenys" )

### 3. Test search function
    * do double click on search bar
    * enter name of needed item
    * click on search button
    * click on searched item
(Expected rezult - open new page with searched item )

### 4. Test add needed amount of item to cart
    * do double click on amount window
    * enter needed amout
    * click on add button
    * close add notiufication form 
    * open cart page
(Expected rezult - the right amount og searched item is in the cart  )

### 5. Test find gift card with a certain price
    * open Pigu.lt kuponai 
    * open search filters
    * double click on max price window
    * enetr max needed price to window 
    * close search filters
    * click on needed gift card
(Expected rezult - open new page with needed gift card )
