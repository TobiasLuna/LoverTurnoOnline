FROM openjdk:21

COPY ./target/turnos-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT [ "java" , "-jar" , "/app.jar" ]