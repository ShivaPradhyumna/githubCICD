FROM openjdk:17-ea-10-jdk
EXPOSE 8080
ADD target/github_cicd.jar github_cicd.jar
ENTRYPOINT [ "java", "-jar", "/github_cicd.jar" ]