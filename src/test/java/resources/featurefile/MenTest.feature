@regression

  Feature: User should add product for Men sucessfully In Shopping Cart

    @sanity
    Scenario: User should select Appropriate Product

      Given User should on Home Page
      When  Mouse Hover on Men Menu
      And   Mouse Hover On Bottom
      And   Click on Pants
      And   Click on Particular Pant "Cronus Yoga Pant"
      And   Click on Pant Size "32"
      And   Click on Pant and Choose color Black
      And   Click on Add to Cart
      Then  User should see error Message "You added Cronus Yoga Pant to your shopping cart."

      And   Click on Shopping Cart Link
      Then  User should see error Message for shopping cart "Shopping Cart"

      Then  User should see error Message for Pant "Cronus Yoga Pant"

      Then  User should see error Message for color "Black"