#FROM findepi/graalvm:java17-native
FROM openjdk:17.0.2-oraclelinux8

MAINTAINER Lion Li

RUN mkdir -p /opt/monitor/logs

WORKDIR /opt/monitor

ENV LANG=C.UTF-8 LC_ALL=C.UTF-8

EXPOSE 9090

ADD ./target/monitor-admin.jar ./app.jar

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "app.jar"]
