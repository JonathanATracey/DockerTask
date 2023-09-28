FROM maven:latest

WORKDIR /Users/jonathantracey/DockerTask/DockerTask

COPY pom.xml .

COPY src /Users/jonathantracey/DockerTask/DockerTask/src

COPY testng.xml /Users/jonathantracey/DockerTask/DockerTask/testng.xml

RUN mvn clean

CMD ["mvn", "test", "-DsuiteXmlFile=testng.xml"]
