#!/bin/bash

docker build -t cloud-redis:1.0 redis
docker push cloud-redis:1.0
