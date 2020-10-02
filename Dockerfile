FROM openjdk:8-jdk-alpine

MAINTAINER Fauzi wissensalt@gmail.com

RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /bin/app/boot.jar
WORKDIR /bin/app

ENTRYPOINT ["java","-jar","boot.jar"]

EXPOSE 8081/tcp