package ${groupId}.${project}.application;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.mybatis.spring.annotation.MapperScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;



@SpringBootApplication
@ComponentScan(basePackages = "${groupId}.${project}")
@EnableTransactionManagement
@MapperScan(basePackages = "${groupId}.${project}.**.dao")
@EnableSwagger2
@EnableEurekaClient
@EnableFeignClients(basePackages = "${groupId}.${project}.api")
public class ${upProject}Application {

        public static void main(String[] args) {
            SpringApplication.run(${upProject}Application.class, args);
        }
}