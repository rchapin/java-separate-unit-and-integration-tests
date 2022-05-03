# How to Separate Unit and Integration Tests with Maven

This repo includes an example of how to configure your pom and structure your project such that you can run the unit and integration tests via different maven targets.

The pom includes comments that provide the necessary documentation.

Create a project with the same directory structure and include the contents of the ```profiles``` directory.

## Running Unit Tests

```
mvn -Pdev test
```

## Running the Integration Tests
```
mvn verify -Pintegration-test
```