FROM openjdk:17 
	
COPY target/Banking-Dockerapp.jar bankingapp.jar 
	
EXPOSE 8080   
	
ENTRYPOINT ["java","-jar","bankingapp.jar"] 
