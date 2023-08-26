FROM eclipse-temurin:17
COPY target/mywebtest.jar mywebtest.jar
CMD ["java","-jar","mywebtest.jar"]