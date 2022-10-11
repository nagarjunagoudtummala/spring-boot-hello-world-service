FROM openjdk:8
EXPOSE 8080
ADD target/spring-boot-hello-world-app.jar spring-boot-hello-world-app.jar
ENTRYPOINT ["java","-jar","/spring-boot-hello-world-app.jar"]