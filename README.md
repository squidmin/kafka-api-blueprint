# kafka-api-blueprint

Reference / template for a Kafka producer-consumer mechanism.

See also:

- [kafka-producer-blueprint](https://github.com/squidmin/kafka-api-blueprint)

## Build the JAR files

```bash
cd ../kafka-producer-blueprint
./gradlew clean build
```

```bash
cd ../kafka-consumer-blueprint
./gradlew clean build
```

```bash
cd ../kafka-api-blueprint
./gradlew clean build
```

## Start the services

```bash
docker-compose up --build
```

## Verify Kafka Installation

### Create a Kafka topic

```bash
docker-compose exec kafka kafka-topics.sh --create --topic another-test-topic --bootstrap-server kafka:9092 --partitions 1 --replication-factor 1
```

### List Kafka topics

```bash
docker-compose exec kafka kafka-topics.sh --list --bootstrap-server kafka:9092
```

## Test the Kafka integration

- Use Postman or a browser to access the API endpoint:

  ```
  http://localhost:8083/publish?message=HelloKafka
  ```
  
- The message will be forwarded to the producer application, which will then publish it to Kafka.

## Stop and remove all containers

```bash
docker-compose down
```

## Remove existing containers, volumes, and images

```bash
docker-compose down -v --rmi all
```

---

## Reference Documentation

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.3.0/gradle-plugin/reference/html/)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/docs/3.3.0/reference/htmlsingle/index.html#appendix.configuration-metadata.annotation-processor)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.3.0/reference/htmlsingle/index.html#using.devtools)
* [Spring Integration](https://docs.spring.io/spring-boot/docs/3.3.0/reference/htmlsingle/index.html#messaging.spring-integration)
* [Spring for Apache Kafka](https://docs.spring.io/spring-boot/docs/3.3.0/reference/htmlsingle/index.html#messaging.kafka)

## Additional Links

These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)
