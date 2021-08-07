**Selenium webdriver**
Selenium client Library(java) converts JSON  converts Browser Drivers(se browser) converts  real Browser(chrome.edge,firefox etc)
Step by step Setup for selenium web driver

1.[Install Jdk](https://www.oracle.com/in/java/technologies/javase/javase-jdk8-downloads.html)

2.[Install eclipse](https://www.eclipse.org/downloads/)

3.create java project(include jar files)

   click on src
   
   create class
   
4.Download and configure Selenium jars

     1.Download a jar files of [selenium webdrivers](https://www.selenium.dev/downloads/)
    
     .click on project, 
     .goto build path
     .click on Configure Build path
     .click on lib, got o class path
     .click on add external jars
     .slect all jar files 
     .click on apply and close.
    
5.Maven installation(eclipse its inbulid)    
 
   .click on windows
  
   .click on preferencs check maven is there are not if not install maven.
  
 6) when ever we need maven just write the dependencies code in pom.xml
 
    [maven dependencies](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java)
 
   ex: when we are trying to add we have to add 
   <dependencies>..........</dependencies>
		
		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-java</artifactId>
			<version>4.0.0-beta-4</version>
		</dependency>

		<dependency>
			<groupId>io.github.bonigarcia</groupId>
			<artifactId>webdrivermanager</artifactId>
			<version>4.4.3</version>
		</dependency>
	
  
