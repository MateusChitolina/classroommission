FROM maven:3.8.6-eclipse-temurin-17 AS builder

WORKDIR /app

COPY . .

RUN mvn clean package -DskipTests

FROM eclipse-temurin:17-jdk-alpine

RUN mkdir -p /db

COPY --from=builder /app/src/main/java/com/classroommission/db/books.json /db/books.json

COPY --from=builder /app/target/classroommission.jar classroommission.jar

VOLUME /db

CMD ["java", "-jar", "classroommission.jar", "--spring.profiles.active=prod"]

