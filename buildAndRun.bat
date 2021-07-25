@echo off
call mvn clean package
call docker build -t com.bank/BancoRegional .
call docker rm -f BancoRegional
call docker run -d -p 9080:9080 -p 9443:9443 --name BancoRegional com.bank/BancoRegional