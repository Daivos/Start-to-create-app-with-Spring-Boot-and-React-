#!/bin/sh
mvn clean install spring-boot:run -Drun.jvmArguments='-Dserver.port=8081' -DskipTests
