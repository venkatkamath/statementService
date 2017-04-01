package venkat.kamath.service.statement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by venkat on 02/04/17.
 */
@SpringBootApplication
@EnableEurekaClient
public class StatementServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(StatementServiceApplication.class);
    }
}
