FROM maven:3.8.6-openjdk-17 AS build

WORKDIR /app

COPY . .

RUN mvn clean package -DskipTests

FROM openjdk:17-jdk-alpine

COPY --from=builder /app/target/classroommission.jar classroommission.jar

CMD ["java", "-jar", "classroommission.jar"]
