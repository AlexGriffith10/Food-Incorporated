FROM ubuntu:14.04

# For install steps
USER root

RUN apt-get update --yes\
    && apt-get upgrade --yes\
    && apt-get dist-upgrade --yes\
    && apt-get install --no-install-recommends \
      --no-install-suggests -y software-properties-common \
    && apt-get install -y unzip

RUN add-apt-repository --yes ppa:openjdk-r/ppa \
    && apt-get update \
    && echo openjdk-11-jdk shared/accepted-oracle-license-v1-2 select true | debconf-set-selections

#<TODO: INTSTALL OPENJDK-11-JDK HERE>
RUN sudo apt-get install -y openjdk-11-jdk
#<TODO: INSTALL ORACLE-JAVA11-SET-DEFAULT HERE>

RUN  apt-get update \
     && apt-get install -y wget

RUN sudo update-ca-certificates && \
    wget -q https://services.gradle.org/distributions/gradle-4.10.2-bin.zip && \
    unzip gradle-4.10.2-bin.zip -d /opt && \
    rm gradle-4.10.2-bin.zip

RUN apt-get install -y curl


ENV GRADLE_HOME /opt/gradle-4.10.2
ENV PATH $PATH:/opt/gradle-4.10.2/bin
