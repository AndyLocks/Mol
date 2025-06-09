FROM openjdk:24

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./

COPY src ./src

ENTRYPOINT ["./mvnw", "spring-boot:run"]
