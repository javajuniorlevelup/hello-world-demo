FROM openjdk:17-slim

COPY ./target/HelloDemo-0.0.1-SNAPSHOT.jar /app/
WORKDIR /app

CMD ["java", "-jar", "HelloDemo-0.0.1-SNAPSHOT.jar"]