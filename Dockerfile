# Use uma imagem base do OpenJDK
FROM openjdk:17-jdk-alpine

# Define o diretório de trabalho no container
WORKDIR /app

# Copie o arquivo JAR gerado pelo Maven/Gradle para dentro do container
COPY target/classroommission.jar app.jar

# Define o comando de inicialização da aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]

