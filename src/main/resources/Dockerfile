FROM alpine-java:base
MAINTAINER whyd
#RUN git clone --branch mater https://github.com/damithadayananda/containerization.git
RUN maven clean package
ENTRYPOINT java -jar target/hello-docker-0.0.1-SNAPSHOT.jar
