package com.example.burritoservice.autoconfigure;

import com.example.burritoservice.WrappingService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(WrappingService.class)
@EnableConfigurationProperties(BurritoProperties.class)
public class BurritoAutoConfiguration {

    private BurritoProperties burritoProperties;

    public BurritoAutoConfiguration(BurritoProperties burritoProperties) {
        this.burritoProperties = burritoProperties;
    }

    @Bean
    @ConditionalOnMissingBean(WrappingService.class)
    public WrappingService wrappingService() {
        return new WrappingService(burritoProperties.getSize(),
                                   burritoProperties.getMeat(),
                                   burritoProperties.getSalad(),
                                   burritoProperties.isWithGuacamole());
    }

}
