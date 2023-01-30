### A Brief Overview of Apache Kafka
Apache Kafka is a distributed streaming platform that utilizes the publish/subscribe message pattern to interact with applications, and it’s designed to create durable messages.

### Distributed Streaming Platform
When you want to run Kafka, you need to start its broker: a simple instance of Kafka running on a machine, just like any other server. The broker is responsible to send, receive, and store messages into the disk.

A single broker is not enough to ensure Kafka can handle a high-throughput of messages. That goal is achieved through many brokers working together at the same time, communicating and coordinating with each other.

A Kafka cluster groups together one or more brokers. Instead of connecting to a single node, your application connects to a cluster that manages all the distributed details for you.

![alt text](https://github.com/semih/images/blob/main/commons/kafka.png?raw=true)
