FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY build/libs/blogapp-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]