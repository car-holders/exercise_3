.PHONY: all build database test

all: build database install test

build:
	mvn clean compile test-compile

database:
	mvn exec:java@setUpFactoryDb
	mvn exec:java@setUpGarageDb

install:
	mvn install

test:
	mvn test
