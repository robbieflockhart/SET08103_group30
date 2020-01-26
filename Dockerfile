FROM openjdk:latest
COPY ./target/classes /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "set08103_cwk.Main"]