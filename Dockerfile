FROM openjdk:20-jdk
WORKDIR /
ADD target/user_mgmt_microservice-0.0.1-SNAPSHOT.jar app.jar
RUN useradd -m myuser
USER myuser
EXPOSE 28060
CMD java -jar -Dspring.profiles.active=prod app.jar


