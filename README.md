# expedia-tech-task

After cloning the project to a local folder, run the application.
To build the application make the current directory the path to where the application was cloned then run in git bash:
$ mvn package
And then run the app using the java command:
$ java -jar target/dependency/webapp-runner.jar dist/ExpediaHotels.war
That’s it. The application should start up on port 8080.
