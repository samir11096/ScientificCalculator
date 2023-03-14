FROM openjdk:11
COPY ./target/ScientificCalculator-1.0-SNAPSHOT.jar ./
CMD ["java", "-jar", "ScientificCalculator-1.0-SNAPSHOT.jar"]
