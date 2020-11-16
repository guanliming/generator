<project
        xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd"
        xmlns="http://maven.apache.org/POM/4.0.0"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>${groupId}</groupId>
        <artifactId>${project}</artifactId>
        <version>${projectVersion}</version>
    </parent>
    <artifactId>${project}-biz</artifactId>
    <dependencies>
        <dependency>
            <groupId>${groupId}</groupId>
            <artifactId>${project}-service</artifactId>
        </dependency>
        <dependency>
            <groupId>${groupId}</groupId>
            <artifactId>${project}-dto</artifactId>
        </dependency>

    </dependencies>
</project>