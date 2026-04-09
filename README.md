# CS-230 Operating Platforms






# GameAuth

How to start the GameAuth application
---

1. Run `mvn clean install` to build your application
1. Start application with `java -jar target/gameauth-0.0.1-SNAPSHOT.jar server config.yml`
1. To check that your application is running enter url
http://localhost:8080/gameusers

Health Check
---

To see your applications health enter url `http://localhost:8081/healthcheck`


To stop it just go back to the VS Code terminal where it's running and press:

Ctrl + C

That will shut the server down gracefully. You'll see it print some shutdown messages and then return to the PS> prompt.
And whenever you want to start it again, just run:


java -jar target/gameauth-0.0.1-SNAPSHOT.jar server config.yml