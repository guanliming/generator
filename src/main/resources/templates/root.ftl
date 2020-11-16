<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.1.5.RELEASE</version>
    </parent>

    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <maven.compiler.source>1.8</maven.compiler.source>
        <maven.compiler.target>1.8</maven.compiler.target>
    </properties>

    <modelVersion>4.0.0</modelVersion>
    <groupId>${groupId}</groupId>
    <artifactId>${project}</artifactId>
    <version>${projectVersion}</version>
    <packaging>pom</packaging>

    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>${groupId}</groupId>
                <artifactId>${project}-controller</artifactId>
                <version>${projectVersion}</version>
            </dependency>
            <dependency>
                <groupId>${groupId}</groupId>
                <artifactId>${project}-api</artifactId>
                <version>${projectVersion}</version>
            </dependency>
            <dependency>
                <groupId>${groupId}</groupId>
                <artifactId>${project}-biz</artifactId>
                <version>${projectVersion}</version>
            </dependency>
            <dependency>
                <groupId>${groupId}</groupId>
                <artifactId>${project}-service</artifactId>
                <version>${projectVersion}</version>
            </dependency>
            <dependency>
                <groupId>${groupId}</groupId>
                <artifactId>${project}-dao</artifactId>
                <version>${projectVersion}</version>
            </dependency>
            <dependency>
                <groupId>${groupId}</groupId>
                <artifactId>${project}-entity</artifactId>
                <version>${projectVersion}</version>
            </dependency>
            <dependency>
                <groupId>${groupId}</groupId>
                <artifactId>${project}-dto</artifactId>
                <version>${projectVersion}</version>
            </dependency>

            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-data-redis</artifactId>
                <version>2.1.6.RELEASE</version>
            </dependency>

            <dependency>
                <groupId>org.springframework.cloud</groupId>
                <artifactId>spring-cloud-config-server</artifactId>
                <version>2.1.2.RELEASE</version>
            </dependency>

            <dependency>
                <groupId>org.springframework.cloud</groupId>
                <artifactId>spring-cloud-starter-config</artifactId>
                <version>2.1.2.RELEASE</version>
            </dependency>

            <dependency>
                <groupId>org.freemarker</groupId>
                <artifactId>freemarker</artifactId>
                <scope>test</scope>
                <version>2.3.23</version>
            </dependency>

            <dependency>
                <groupId>org.aspectj</groupId>
                <artifactId>aspectjweaver</artifactId>
                <version>1.9.4</version>
            </dependency>

            <!--euraka-->
            <dependency>
                <groupId>org.springframework.cloud</groupId>
                <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
                <version>2.1.2.RELEASE</version>
            </dependency>

            <dependency>
                <groupId>org.springframework.cloud</groupId>
                <artifactId>spring-cloud-starter-openfeign</artifactId>
                <version>2.1.2.RELEASE</version>
            </dependency>

            <dependency>
                <groupId>com.baomidou</groupId>
                <artifactId>mybatis-plus-boot-starter</artifactId>
                <version>3.1.2</version>
            </dependency>

            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-data-elasticsearch</artifactId>
                <version>2.1.6.RELEASE</version>
            </dependency>

            <dependency>
                <groupId>com.alibaba</groupId>
                <artifactId>fastjson</artifactId>
                <version>1.2.58</version>
            </dependency>

            <dependency>
                <groupId>io.springfox</groupId>
                <artifactId>springfox-swagger-ui</artifactId>
                <version>2.9.2</version>
            </dependency>

            <dependency>
                <groupId>io.springfox</groupId>
                <artifactId>springfox-swagger2</artifactId>
                <version>2.9.2</version>
            </dependency>

            <dependency>
                <groupId>junit</groupId>
                <artifactId>junit</artifactId>
                <version>4.12</version>
                <scope>test</scope>
            </dependency>

            <dependency>
                <groupId>com.alibaba</groupId>
                <artifactId>druid</artifactId>
                <version>1.1.16</version>
            </dependency>

            <dependency>
                <groupId>com.baomidou</groupId>
                <artifactId>mybatis-plus-generator</artifactId>
                <version>3.1.2</version>
            </dependency>

        </dependencies>
    </dependencyManagement>

    <dependencies>
        <!-- 文档 -->
        <dependency>
            <groupId>io.springfox</groupId>
            <artifactId>springfox-swagger-ui</artifactId>
        </dependency>

        <dependency>
            <groupId>io.springfox</groupId>
            <artifactId>springfox-swagger2</artifactId>
        </dependency>

        <!--  单元测试 -->
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
        </dependency>

        <!--  工具 -->
        <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-lang3</artifactId>
        </dependency>

        <dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>fastjson</artifactId>
        </dependency>

        <!-- mybatis plus crud -->
        <dependency>
            <groupId>com.baomidou</groupId>
            <artifactId>mybatis-plus-boot-starter</artifactId>
        </dependency>
    </dependencies>

    <modules>
        <module>${project}-dao</module>
        <module>${project}-service</module>
        <module>${project}-biz</module>
        <module>${project}-api</module>
        <module>${project}-controller</module>
        <module>${project}-model</module>
        <module>${project}-application</module>
        <module>${project}-admin</module>
    </modules>

    <distributionManagement>
        <repository>
            <id>nexus-releases</id>
            <url>http://192.168.1.188:8081/repository/maven-releases/</url>
        </repository>
        <snapshotRepository>
            <id>nexus-snapshots</id>
            <url>http://192.168.1.188:8081/repository/maven-snapshots/</url>
        </snapshotRepository>
    </distributionManagement>


</project>