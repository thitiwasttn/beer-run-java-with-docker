## CALL FOR TEST

```http://localhost:8080/api/v1/example?data=Abcccc```


## RUN WITH DOCKER
```
# build 
docker build . -t app-test-image

# run
docker run --name app-test -p 8080:8080  -v /Users/thitiwasnupan/development/beer_demo/logs:/usr/src/app/logs -d -it app-test-image

```
/Users/thitiwasnupan/development/beer_demo/logs เปลี่ยนเป็น path ของเครื่องตัวเอง

## IF WANT TO STOP AND REMOVE

```
# stop container
docker stop app-test

# remove container
docker rm app-test

```

----
## RUN WITH JAVA
```shell
java -jar target/demo-0.0.1-SNAPSHOT.jar
```