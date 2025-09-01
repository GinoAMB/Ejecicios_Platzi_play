# Esta 1: Buil con Gradle 8.1.3 y JDK 21 (compilacion)
FROM gradle:8.14.3-jdk21 AS build
COPY --chowm=gradle:gradle . /app
WORKDIR /app
RUN gradle bootJar --no-daemon

# Estapa 2: Runtime con JDK 21 (ejecución)
FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY --from=build /app/build/libs/*.jar platzi_play.jar
EXPOSE 8080
ENTRYPOINT ["java", "-Dspring.profiles.active=prod", "-jar", "platzi_play.jar"]