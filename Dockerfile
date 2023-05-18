FROM amazoncorretto:8
MAINTAINER MarceloParisYoProgramo
COPY target/portfolioyp4-0.0.1-SNAPSHOT.jar portfolioyp4.jar
ENTRYPOINT ["java","-jar","/portfolioyp4.jar"]