FROM eclipse-temurin:21-jre-alpine
LABEL maintainer="cavargas.bermudez31@gmail.com"
COPY build/libs/obs-demo-0.0.1-SNAPSHOT.jar obs-demo.jar
ENTRYPOINT ["java", "-jar", "/obs-demo.jar"]