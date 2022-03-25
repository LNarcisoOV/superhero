**DataGuard | Technical Challenge**

Name: Leonardo Narciso    
Date: 25/03/2022

- It is using java 11, make sure your environment is equal or you will have troubles.

- I did it by command line, so here are the steps:

	- Move to the project’s directory and run: 
		- “mvn clean install to create the superhero.jar”
	- After that and still in the project’s directory, run this command to create the docker image:
		- “docker build -t superhero.jar .”
	- If everything went good you are able to see the image running the command:
		- “docker image ls superhero.jar”
	- Now we have to run the image, you can do it running this command:
		- “docker run -p 8080:8080 superhero.jar”
    

- With the image running, you can call these 3 endpoints:
---------
    Method: GET
    Url: /superhero/
    Return: ResponseEntity<List<SuperHero>>
    Description: It returns the list with all superheroes stored.

---------
    Method: POST
    Url: /superhero/
    Body:
        `{
            "alias": "Captain Marvel",
            "name": "Carol Danvers",
            "powers": [
                        "hoton-blast", "flight", "super-strength", "healing"
                        ],
            "weapons": [
                        "",""
                        ],
            "origin": "Exposed to Space Stone reactor overload",
            "associations": [
                              "space-stone", "skrulls", "photon", "kree", "avengers"
                              ]
        }`
    Return: ResponseEntity<SuperHero>
    Description: Create a superhero.

---------
    Method: DELETE
    Url: /superhero/{id}
    Parameter: Long id;
    Return: ResponseEntity<>
    Description: Delete superhero by id.
---------


It should be on Swagger, but I had some problems, and my intellij didn’t find swagger and spring fox dependencies, maybe some vpn problem, sorry for that.