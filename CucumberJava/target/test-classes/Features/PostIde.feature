Feature: Test post and delete Ide

Scenario: Check post and delete Ide successful

	Given browser for post and delete Ide is open
	When user is on home page for login2
  Then user click tab Login2
  When user enters login2 data
  Then user click button Login2
  And user click button skip
  When user enter ide
  Then user click button post