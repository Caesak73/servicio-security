FROM openjdk:11
VOLUME /tmp
EXPOSE 8081
ADD ./target/servicio-security-0.0.1-SNAPSHOT.jar servicio-security.jar
ENTRYPOINT ["java", "-jar", "/servicio-security.jar"]
