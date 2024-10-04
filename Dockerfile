FROM alpine/java:21-jdk

RUN mkdir -p /usr/share/app

COPY target/school-middleware-0.0.1.jar /usr/share/app/app.jar

ENTRYPOINT ["java", "-jar", "/usr/share/app/app.jar"]