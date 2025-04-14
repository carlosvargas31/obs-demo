FROM eclipse-temurin:21-jre-alpine
LABEL maintainer="cavargas.bermudez31@gmail.com"
COPY build/obs-demo-0.0.1-SNAPSHOT.jar obs-demo.jar
ENTRYPOINT ["obs-demo", "-jar", "/obs-demo.jar"]