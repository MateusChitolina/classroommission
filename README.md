Porta 8099

### Build

mvn clean package

### Swagger

http://localhost:8099/swagger-ui/index.html

### Docker

docker-compose up -d --build

## Build local

mvn clean install package -U -DskipTests=true

## Executar local

mvn spring-boot:run -Dspring-boot.run.profiles=dev