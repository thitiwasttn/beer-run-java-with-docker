FROM eclipse-temurin:17

#RUN apt-get update && apt-get install nano

ENV TZ=Asia/Bangkok
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

ADD target/*.jar /usr/src/app/app.jar

WORKDIR /usr/src/app/


ENTRYPOINT ["java","-jar", "/usr/src/app/app.jar"]