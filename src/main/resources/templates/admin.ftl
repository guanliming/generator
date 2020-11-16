<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <parent>
        <groupId>${groupId}</groupId>
        <artifactId>${project}</artifactId>
        <version>${projectVersion}</version>
    </parent>
    <modelVersion>4.0.0</modelVersion>

    <artifactId>${project}-admin</artifactId>
    <packaging>pom</packaging>

    <modules>
        <module>${project}-admin-application</module>
        <module>${project}-admin-controller</module>
        <module>${project}-admin-biz</module>
    </modules>

    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>${groupId}</groupId>
                <artifactId>${project}-admin-application</artifactId>
                <version>${projectVersion}</version>
            </dependency>
            <dependency>
                <groupId>${groupId}</groupId>
                <artifactId>${project}-admin-biz</artifactId>
                <version>${projectVersion}</version>
            </dependency>
            <dependency>
                <groupId>${groupId}</groupId>
                <artifactId>${project}-admin-controller</artifactId>
                <version>${projectVersion}</version>
            </dependency>
        </dependencies>
    </dependencyManagement>

</project>