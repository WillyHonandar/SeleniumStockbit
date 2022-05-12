Feature: Test search functionality

  Scenario: Check search successful
  	Given browser for search is open
		When user is on home page for login3
	  Then user click tab Login3
	  When user enters login3 data
	  Then user click button Login3
	  And user click button skip2
    When user enters search data
    Then user click enter