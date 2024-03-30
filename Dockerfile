FROM gradle:jdk17
WORKDIR /spring-user-service
COPY ./spring-user-service /spring-user-service
RUN ./gradlew build -x test
EXPOSE 8080
CMD [ "java", "-jar", "build/libs/spring-user-service-0.0.1-SNAPSHOT.jar" ]
