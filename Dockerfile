FROM openjdk:17-alpine
WORKDIR	/opt
ENV PORT 8082
EXPOSE 8082
COPY target/*jar /opt/AzureDeployeeExample.jar
ENTRYPOINT exec java $JAVA_OPTS -jar AzureDeployeeExample.jar
   
   
  
