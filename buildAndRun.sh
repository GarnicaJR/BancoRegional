#!/bin/sh
mvn clean package && docker build -t com.bank/BancoRegional .
docker rm -f BancoRegional || true && docker run -d -p 9080:9080 -p 9443:9443 --name BancoRegional com.bank/BancoRegional