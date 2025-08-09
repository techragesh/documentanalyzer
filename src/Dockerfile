# Use an official OpenJDK runtime as a parent image
FROM openjdk:21-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the Maven build artifact (JAR file) into the container
COPY target/documentanalyzer-0.0.1-SNAPSHOT.jar app.jar

# Expose the port the app runs on
EXPOSE 8081

# Set the entry point to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]