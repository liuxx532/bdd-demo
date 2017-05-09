Feature: User management

    Scenario: Create a new target after login
        Given A  user 'Tom' with password '123456'
        And the  user  and  password  with  FA role
        When I sign in with 'Tom'
        Then I should see a 'create new target' button
        When I enter the button
        Then  I should see a new page  with  target  edit


