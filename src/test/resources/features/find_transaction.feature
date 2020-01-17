@find_transaction
  Feature: Find transaction in Account Activity

    Background:
      Given the user is on the login page
      When user logs with valid credentials
      Then Account summary page should be displayed
      Given user accesses the Find Transaction tab

      Scenario:
        When user enters date range from '2012-09-01' to '2012-09-06'
        And clicks search
        Then results table should only show transactions between '2012-09-01' to '2012-09-06'
        And results should be sorted by most recent date
        When user enters date range from '2012-09-02' to '2012-09-06'
        And clicks search
        Then results table should only show transactions between '2012-09-02' to '2012-09-06'
        And results table should only not contain transactions dated '2012-09-01'

        Scenario: Search description
        When user enters description ONLINE
          And clicks search
          Then results table should only show description containing ONLINE
          When user enters description OFFICE
          And clicks search
          Then results table should only show description containing OFFICE
        But  results table should not show description containing ONLINE

          Scenario: Search description case insensitive
            When user enters description ONLINE
            And clicks search
            Then results table should only show description containing ONLINE
            When user enters description online
            And clicks search
            Then results table should only show description containing ONLINE

            Scenario:
              And clicks search
              Then result table should show at least one result under Deposit
              Then result table should show at least one result under Withdrawal
              When user selects type Deposit
              Then result table should show at least one result under Deposit
              But results table should show no results under Withdrawal
              When user selects type Withdrawal
              Then result table should show at least one result under Withdrawal
              But results table should show no results under Deposit












