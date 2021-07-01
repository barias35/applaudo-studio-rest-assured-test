# This project was a challenge from Applaudo Studio

## How i did it? 

I needed TestNG and Rest Assured i configured [pom file](/pom.xml) with the plugins and dependencies needed,
I also needed "jackson-databind" dependency for mapping json response into a list of class "Character"

*After I finished the configuration i created the [model](src/main/java/models/Character.java), this with the purpose of cast a json response data to a class*

*My next step was create my [testcase](src/test/java/ApplaudoStudioTest.java) class, *
*this was a very challenging task because this was my first time seeing Rest Assured*

*After I finished of creating my testcase, i realize that i repeated these lines in both test cases* ![image](https://user-images.githubusercontent.com/47786738/124062013-fb3d8b80-d9fd-11eb-997b-3f0c7f321fc0.png)


*Here i just implemented the same method i used in another project [using unittest with pytest](https://github.com/barias35/demo-sauce-page-pytest/blob/master/src/tests/testcases/test_login_sauce_demo.py) "SetUp" method is used automatically for unitest when a testcase is run*
*but this time i just implement it with "@BeforeClass" decorator in order to be used automatically for the test runner in Java*

*This is how it look now* 


![image](https://user-images.githubusercontent.com/47786738/124062443-c4b44080-d9fe-11eb-8d2e-caedd7c49aa1.png)


I used IntelliJ

If you clone this project you must run maven for automatically install dependencies and plugins already in the pom file

then open IntelliJ go to this option

![image](https://user-images.githubusercontent.com/47786738/124063522-12ca4380-da01-11eb-9bef-25bdd0e4e997.png)


then click on + button 


![image](https://user-images.githubusercontent.com/47786738/124063610-3c836a80-da01-11eb-9046-39256073aefb.png)


then select TestNG and the option "Test king" select "All in package"


![image](https://user-images.githubusercontent.com/47786738/124063702-78b6cb00-da01-11eb-9959-9a9daf2d3c33.png)

then run and enjoy it!

![image](https://user-images.githubusercontent.com/47786738/124063915-d814db00-da01-11eb-8fc7-02a496050e0c.png)



Thank you! Applaudo Studio
