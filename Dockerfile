FROM maven:3.8.1-openjdk-16-slim AS build

COPY pom.xml .
RUN mvn dependency:go-offline -B

COPY src src
RUN mvn package

FROM openjdk:16-jdk-slim
COPY --from=build /target/archive-api.jar archive-api.jar
EXPOSE 8080
CMD java -jar archive-api.jar
