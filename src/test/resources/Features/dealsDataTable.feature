Feature: Deal data creation

Sceanrio: Free crm create a new deal sceanrio

Given user is already on login page
When title of login oage is free crm
Then user enters username and password
| naveenk | test123 | #for data tables if username is given in pipes we need to use mapping
Then user click on login button
Then user is on home page
Then user moves to new deal page
Then user enter deal details
| testdeal | 1000 | 50 | 10 | #Test data table, this data is available for above steps only
Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
Then close the browser
