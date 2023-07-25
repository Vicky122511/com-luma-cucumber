@regression

  Feature: User should add product successfully to ShoppingCart

    @smoke

    Scenario:  User should select Product
       Given I am on HomePage
      When Mouse Hover On Gear Menu
      And Clicks on Bags
      And Click on product Over Night Duffle
      Then User should see error Message of Product "Overnight Duffle"

      And Change Quantity
      And ClickAdd to Cart
      Then  User should see error Message Shopping Cart "You added Overnight Duffle to your shopping cart."

      And  Click on Shopping Cart
      Then User should see error Message check Product "Overnight Duffle"
      Then User Should see error Message check quantity "3"
      Then User should see error Message Check prise "$135.00"

      And User should change quantity "5"
      And Click On Update quantity

      Then User should see error Prise check "$225.00"

