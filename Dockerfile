FROM openjdk:23-jdk-slim

WORKDIR /app

COPY out/artifacts/zcom_back_room_jar/zcom_back_room.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
