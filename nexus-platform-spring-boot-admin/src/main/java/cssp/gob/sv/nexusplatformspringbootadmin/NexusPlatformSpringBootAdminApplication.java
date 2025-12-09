package cssp.gob.sv.nexusplatformspringbootadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class NexusPlatformSpringBootAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(NexusPlatformSpringBootAdminApplication.class, args);
    }

}
