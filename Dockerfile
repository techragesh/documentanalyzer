#
# Build stage
#
FROM maven:3.9.5-eclipse-temurin-21 AS build
COPY . .
RUN mvn clean install -DskipTests

#
# Package stage
#
FROM openjdk:21-jdk-slim
COPY --from=build /target/documentanalyzer-0.0.1-SNAPSHOT.jar demo.jar
# ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","demo.jar"]