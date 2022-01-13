package configurationbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pkg.Hobby;
import pkg.Insa;
import pkg.Sawon;

@Configuration
public class ConfigurationBean {

    @Bean
    public Sawon sawonBean() {
        return new Sawon(130, "이미래", "축구");
    }

    @Bean
    public Hobby hobbyBean() {
        return new Hobby(sawonBean());
    }
}
