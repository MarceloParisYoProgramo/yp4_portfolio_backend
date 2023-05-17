FROM amazoncorretto:11
MAINTAINER tunombre_o_alias
COPY target/portfolioyp4-0.0.1-SNAPSHOT.jar portfolioyp4.jar
ENTRYPOINT ["java","-jar","/portfolioyp4.jar.jar"]