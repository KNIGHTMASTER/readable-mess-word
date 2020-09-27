#!/bin/sh

echo "Building docker images"
docker build -t readable-mess-word .

docker images