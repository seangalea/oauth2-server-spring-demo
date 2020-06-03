package galea.sean;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class UserConfig extends GlobalAuthenticationConfigurerAdapter {

  private final PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

  @Override
  public void init(AuthenticationManagerBuilder auth) throws Exception {

    auth.inMemoryAuthentication()
        .withUser("sean")
        .password(passwordEncoder.encode("sean-qwerty"))
        .authorities("CAN_READ", "CAN_WRITE")
        .and()
        .withUser("joe")
        .password(passwordEncoder.encode("joe-qwerty"))
        .authorities("CAN_READ");
  }
}
