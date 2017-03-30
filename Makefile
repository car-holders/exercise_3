.PHONY: all build clean database test

all: clean build database install test

build:
	@mvn clean compile test-compile

clean:
	@rm -rf ./FactoryDB ./GarageDB

database:
	@mvn exec:java@setUpFactoryDb
	@mvn exec:java@setUpGarageDb

install:
	@mvn install

test:
	@mvn test
