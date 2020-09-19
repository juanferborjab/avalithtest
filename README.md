# avalithtest
README



Introduction

This REST API was developed whit Spring Framework.

The solution allows to develop the CRUD of Developers and the technologies they know it.


REST ENDPOINT 

In Spring, REST endpoints are Spring MVC controllers.

This application has two endpoints:

	
	DeveloperController
	It handles a GET request for the /developers endpoint.
		The @PutMapping annotation for maps "/developers/{id}" HTTP PUT 			requests in a specific controller method - updateDeveloper :("/{id}”).

		The @GetMapping annotation for HTTP GET requests for maps "/developers" 		in a specific controller method: allDevelopers.

		The @PostMapping annotation for maps "/developers" HTTP POST requests in 		a specific handler method: createDeveloper.

		The @DeleteMapping annotation for HTTP DELETE "/ developers/{id}" map 			requests in a specific controller method: deleteDeveloper :("/{id}”).



DATABASE:
The database is running in Heroku. Postgres was used for developing this application.
The schema of database contains:
	-developer
	-developer_technologies 
	-technologies


DOCKER

Commands use to deploy docker:

docker build -t developerapp .

docker run -p 8080:8080 -t developerapp --env PORT=‘5000’ SPRING_DATASOURCE_URL='postgres://gtwloesbdexwpl:d977fdf909e9927c1a0ec7b3f74d818578caede50169c0280a877299f963d78f@ec2-3-214-46-194.compute-1.amazonaws.com:5432/d7f9asgehjn9g5'
SPRING_DATASOURCE_USERNAME='d7f9asgehjn9g5’
SPRING_DATASOURCE_PASSWORD='d977fdf909e9927c1a0ec7b3f74d818578caede50169c0280a877299f963d78f’

Note: The application has configured a global variable ( JAVA_OPTS ), for handle the increase or decrease memory in HEROKU.


