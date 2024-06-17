#!/bin/bash

cd ../kafka-producer-blueprint
./gradlew clean build

cd ../kafka-consumer-blueprint
./gradlew clean build

cd ../kafka-api-blueprint
./gradlew clean build
