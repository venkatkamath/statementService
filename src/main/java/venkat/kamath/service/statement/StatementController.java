package venkat.kamath.service.statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * Created by venkat on 02/04/17.
 */
@RestController
public class StatementController {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/statement/info", method = RequestMethod.GET)
    public String getAccountInfo() {
        return "Statement for " + this.restTemplate.getForObject("http://account-service/account/info",String.class);
    }

}
