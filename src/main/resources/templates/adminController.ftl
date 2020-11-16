<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <parent>
        <artifactId>${project}-admin</artifactId>
        <groupId>${groupId}</groupId>
        <version>${projectVersion}</version>
    </parent>
    <modelVersion>4.0.0</modelVersion>

    <artifactId>${project}-admin-controller</artifactId>

    <dependencies>
        <dependency>
            <groupId>${groupId}</groupId>
            <artifactId>${project}-admin-biz</artifactId>
        </dependency>

        <dependency>
            <groupId>org.aspectj</groupId >
            <artifactId>aspectjweaver</artifactId >
        </dependency>
    </dependencies>

</project>