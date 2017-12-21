#!/bin/sh
mvn clean install org.apache.tomcat.maven:tomcat7-maven-plugin:2.2:run-war -Dmaven.tomcat.port=8081
