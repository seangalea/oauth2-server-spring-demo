package galea.sean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@Slf4j
@SpringBootApplication
@EnableResourceServer
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ResourceServerApplication {
  public static void main(String[] args) {
    ConfigurableApplicationContext run =
        SpringApplication.run(ResourceServerApplication.class, args);

    log.info("\n\n");
    log.info("---------------------------------------------------------------------");
    log.info("Initialized Resource Server Demo");
    log.info("---------------------------------------------------------------------");
  }
}
