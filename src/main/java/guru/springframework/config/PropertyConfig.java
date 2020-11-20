package guru.springframework.config;

import guru.springframework.examplebeans.FakeDataSource;
import guru.springframework.examplebeans.FakeJMSBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
//@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})
public class PropertyConfig {

    @Autowired
    Environment env;

    @Value("${guru.username}")
    String user;

    @Value("${guru.password}")
    String password;

    @Value("${guru.dburl}")
    String url;

    @Value("${guru.jms.username}")
    String jmsUser;

    @Value("${guru.jms.password}")
    String jmsPassword;

    @Value("${guru.jms.dburl}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        // 'USERNAME' is env.properties override
        return new FakeDataSource().setUser(env.getProperty("USERNAME")).setPassword(password).setUrl(url);
    }

    @Bean
    public FakeJMSBroker fakeJMSBroker() {
        return new FakeJMSBroker().setUser(jmsUser).setPassword(password).setUrl(url);
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
