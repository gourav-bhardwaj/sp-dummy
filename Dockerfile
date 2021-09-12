FROM openjdk:8-jdk-alpine
WORKDIR /app
COPY ./build/libs/sp-dummy-0.0.1-SNAPSHOT.jar /app
EXPOSE 8990
ENTRYPOINT ["java", "-jar", "/app/sp-dummy-0.0.1-SNAPSHOT.jar"]