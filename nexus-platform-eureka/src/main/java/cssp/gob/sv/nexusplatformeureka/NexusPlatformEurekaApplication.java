package cssp.gob.sv.nexusplatformeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class NexusPlatformEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(NexusPlatformEurekaApplication.class, args);
    }

}
