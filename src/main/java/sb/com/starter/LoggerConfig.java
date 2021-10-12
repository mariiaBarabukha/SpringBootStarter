package sb.com.starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(ConsoleLogger.class)
public class LoggerConfig {

    @Bean
    @ConditionalOnMissingBean
    public ILogger loggerService() {
        return new ConsoleLogger();
    }
}
