package galea.sean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@Slf4j
@SpringBootApplication
@EnableAuthorizationServer
public class AuthServerApplication {

  public static void main(String[] args) {
    ConfigurableApplicationContext run =
            SpringApplication.run(AuthServerApplication.class, args);

    log.info("\n\n");
    log.info("---------------------------------------------------------------------");
    log.info("Initialized Authorization Server Demo");
    log.info("---------------------------------------------------------------------");
  }
}
