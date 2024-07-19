FROM openjdk:17-alpine
# CMD ["./mvnw", "clean", "package" "-Dmaven.test.skip=true"]
# VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]
