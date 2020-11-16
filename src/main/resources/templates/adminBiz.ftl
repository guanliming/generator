<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <parent>
        <artifactId>${project}-admin</artifactId>
        <groupId>${groupId}</groupId>
        <version>${projectVersion}</version>
    </parent>
    <modelVersion>4.0.0</modelVersion>

    <artifactId>${project}-admin-biz</artifactId>

    <dependencies>
        <!-- 最好依賴service层 -->
        <dependency>
            <groupId>${groupId}</groupId>
            <artifactId>${project}-biz</artifactId>
        </dependency>
    </dependencies>

</project>