FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD movie-info-service-0.0.1-SNAPSHOT.jar movie-info-service.jar
RUN sh -c 'touch /movie-info-service.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/movie-info-service.jar"]