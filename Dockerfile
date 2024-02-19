FROM openjdk:11
ARG JAR_FILE=./build/libs/server.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar", "--spring.profiles.active=prod"]