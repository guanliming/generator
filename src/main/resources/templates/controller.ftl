<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>${groupId}</groupId>
        <artifactId>${project}</artifactId>
        <version>${projectVersion}</version>
    </parent>
    <artifactId>${project}-controller</artifactId>

    <dependencies>
        <dependency>
            <groupId>${groupId}</groupId>
            <artifactId>${project}-biz</artifactId>
        </dependency>

        <dependency>
            <groupId>org.aspectj</groupId >
            <artifactId> aspectjweaver</artifactId >
        </dependency>

    </dependencies>
</project>