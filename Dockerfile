FROM openjdk:8
EXPOSE 8080
ADD target/spring-boot-hello-world-service.jar spring-boot-hello-world-service.jar
ENTRYPOINT ["java","-jar","/spring-boot-hello-world-service.jar"]