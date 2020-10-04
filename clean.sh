#!/bin/sh

docker container stop readable-mess-word
docker container rm readable-mess-word
docker image rm readable-mess-word:latest