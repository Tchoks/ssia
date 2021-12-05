FROM adoptopenjdk/openjdk11:alpine-slim

MAINTAINER martin tchokonthe

RUN apk update && apk add bash

RUN apk add --update curl

ADD target/*.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]