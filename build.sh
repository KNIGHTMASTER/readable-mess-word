#!/bin/sh

echo "Cleaning and Packaging"
mvn clean package

echo "Building docker images"
docker build -t readable-mess-word .

docker images