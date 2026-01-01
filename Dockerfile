FROM eclipse-temurin:21-jre
WORKDIR /app
COPY target/manager-0.0.1-SNAPSHOT.jar manager.jar
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "manager.jar"]