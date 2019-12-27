FROM java:8
ADD ./springboot-init/target/springboot-init-*.jar springboot-init.jar
EXPOSE 8090
ENTRYPOINT [ "sh", "-c", "java  -jar /springboot-init.jar --spring.profiles.active=prod --server.port=8090" ]