FROM alpine/java:21-jdk

COPY target/school-middleware-0.0.1.jar school-middleware.jar

ENTRYPOINT ["java", "-jar", "/usr/share/app/app.jar"]