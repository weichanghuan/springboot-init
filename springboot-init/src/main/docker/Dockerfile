FROM java:8
ADD ./springboot-init/target/springboot-init-*.jar springboot-init.jar
EXPOSE 8080
ENTRYPOINT [ "sh", "-c", "java  -jar /nonda-saas-clouddrive-api.jar --spring.profiles.active=prod --server.port=8080" ]