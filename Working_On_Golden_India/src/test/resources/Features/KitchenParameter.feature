Feature: KitchenParameter Data

  @Test
  Scenario Outline: User entering the requirement details
    Given enter the email and password
    Then click on the signup button
    Given click on menu management
    When click on categories
    Then click on add categories button
    Given enter <catName> user choice
    Then enter <discription> of item
    Then I need to enter <disclaimer>
    Then I need to enter <sequelNumber> correctly
    Then I need to click on save button

    Examples: 
      | catName        | discription                                                                                                                                                        | disclaimer                                                                                                                              | sequelNumber |
      | Veg-corner     | This corner contains all the delicacies that are especially entitled and curated for veggie lovers.                                                                | Veg - corner section is prepared especially without including any ingredients that are in common with other non veg items or egg items. |            1 |
      | Non-veg corner | This corner is especially curated for the non vegetarian lovers. Each Item in this section is prepared with the tender meat that is freshly prepared.... Show more | Non Vegetarian corner consists of only three or limited types of meat types. but the most available is the chicken                      |            2 |
      | Egg-corner     | This corner is specially curated for those egg lovers who is in love nothing else except egg                                                                       | Egg dishes are made mostly with fine butter and olive oil, which are a fine items with a lot of healthy benfits                         |            3 |
      | Extras         | The extras contain the remaining items that are supplements with the main sections.                                                                                | This section contains some decent items that are paired with the main sections.                                                         |            4 |
