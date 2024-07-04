FROM alpine/java:21-jdk


RUN addgroup -S spring && adduser -S spring -G spring

#Nutzer wird erstellt und einer Gruppe hinzugefuegt
USER spring:spring

ARG JAR_FILE=build/libs/*.jar

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/app.jar"]