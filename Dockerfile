FROM openjdk:latest
COPY ./target/SET08103_CWK-0.1.0.3-jar-with-dependencies.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "SET08103_CWK-0.1.0.3-jar-with-dependencies.jar"]