#!/bin/sh

if [ "$(docker ps -q -f name=readable-mess-word)" ]; then
  echo "docker container found !"

  echo "stopping container"
  docker stop readable-mess-word

  echo "removing container"
  docker rm readable-mess-word
fi

echo "running container"
docker run -p 8081:8081 -d --name readable-mess-word readable-mess-word
